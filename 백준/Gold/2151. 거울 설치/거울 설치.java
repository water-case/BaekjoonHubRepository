import java.io.*;
import java.util.*;

public class Main {
	
	static int[] delx=new int[] {-1, 0, 1, 0}; // 상우하좌
	static int[] dely=new int[] { 0, 1, 0,-1}; // 상우하좌
	static int[] door;
	static ArrayList<int[]>[][] g;
	static int N, res=Integer.MAX_VALUE;
	static boolean[][][] v;
	static char[][] map;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		N=Integer.parseInt(br.readLine());
		map=new char[N][N];
		v=new boolean[N][N][4];
		for(int i=0; i<N; i++) {
			char[] ca=br.readLine().toCharArray();
			for(int j=0; j<N; j++) {
				map[i][j]=ca[j];
				if(map[i][j]=='#') {
					door=new int[] {i,j};
				}
			}
		}
		map[door[0]][door[1]]='.';
		bfs();
		
		System.out.println(res);
		br.close();
	}

	private static void bfs() {
		PriorityQueue<int[]> pq=new PriorityQueue<>((o1, o2)-> {return Integer.compare(o1[3], o2[3]);});
		int initx=door[0], inity=door[1];
		for(int i=0; i<4; i++) pq.offer(new int[] {initx,inity,i,0});
		while(!pq.isEmpty()) {
			int[] now=pq.poll();
			int x=now[0], y=now[1], d=now[2], cnt=now[3];
			
			if(v[x][y][d]) continue;
			v[x][y][d]=true;
			
			if(map[x][y]=='#') {
				res=cnt;
				return;
			}
			
			int dx=x+delx[d];
			int dy=y+dely[d];
			if(dx<0||dx>=N||dy<0||dy>=N||map[dx][dy]=='*') continue;
			
			pq.offer(new int[] {dx,dy,d,cnt});
			if(map[dx][dy]=='!') {
				d=(d+1)%4;
				pq.offer(new int[] {dx,dy,d,cnt+1});
				
				d=(d+2)%4;
				pq.offer(new int[] {dx,dy,d,cnt+1});
			}
		}
	}

}
