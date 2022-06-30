import java.io.*;
import java.util.*;

public class Main {

	static class Pos {
		int x, y;

		public Pos(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
		
	}
	
	static int[] delx= {-1, 0, 1, 0}; // 상우하좌
	static int[] dely= { 0, 1, 0,-1};
	static int R, C, day=0;
	static char[][] map;
	static boolean[][] v;
	static ArrayList<Pos> l=new ArrayList<>();
	static ArrayDeque<Pos> sq=new ArrayDeque<>();
	static ArrayDeque<Pos> wq=new ArrayDeque<>();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		R=Integer.parseInt(st.nextToken());
		C=Integer.parseInt(st.nextToken());
		map=new char[R][C];
		
		for(int i=0; i<R; i++) {
			map[i]=br.readLine().toCharArray();
			
			// 백조 위치 찾기
			for(int j=0; j<C; j++) {
				if(map[i][j]=='L') {
					l.add(new Pos(i, j));
					map[i][j]='.';
				}
				
				if(map[i][j]=='.')
					wq.offer(new Pos(i, j));
			}
		}
		
		v=new boolean[R][C];
		Pos n1=l.get(0);
		sq.offer(new Pos(n1.x, n1.y));
		v[n1.x][n1.y]=true;
		
		while(!search()) {
			plusDay();
		}

		System.out.println(day);
		br.close();
	}

	// 1일치 빙판 녹이기
	static void plusDay() {
		day++;
		int size=wq.size();
		for(int i=0; i<size; i++) {
			Pos now=wq.poll();
			
			for(int d=0; d<4; d++) {
				int dx=now.x+delx[d], dy=now.y+dely[d];
				if(dx<0||dx>=R||dy<0||dy>=C) continue;
				if(map[dx][dy]=='X') {
					map[dx][dy]='.';
					wq.offer(new Pos(dx, dy));
				}
			}
		}
	}

	// 백조 찾기
	static boolean search() {
		ArrayDeque<Pos> q=new ArrayDeque<>();
		Pos n2=l.get(1);
		
		while(!sq.isEmpty()) {
			Pos now=sq.poll();
			
			if(now.x==n2.x && now.y==n2.y) return true;
			
			for(int d=0; d<4; d++) {
				int dx=now.x+delx[d], dy=now.y+dely[d];
				if(dx<0||dx>=R||dy<0||dy>=C||v[dx][dy]) continue;
				v[dx][dy]=true;
				     if(map[dx][dy]=='.') sq.offer(new Pos(dx, dy));
				else if(map[dx][dy]=='X')  q.offer(new Pos(dx, dy));
			}
		}
		
		sq=q;
		return false;
	}
	
}
