import java.io.*;
import java.util.*;

public class Main {

	static int[] delx={-1,-1, 0, 1, 1, 1, 0,-1}; // 상부터 시계방향
	static int[] dely={ 0, 1, 1, 1, 0,-1,-1,-1}; // 상부터 시계방향
	
	static int N, M, res=Integer.MIN_VALUE;
	static int[][] map;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		map=new int[N][M];
		
		for(int i=0; i<N; i++) {
			st=new StringTokenizer(br.readLine()," ");
			for(int j=0; j<M; j++) {
				map[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				res=Math.max(res, bfs(i,j));
			}
		}

		System.out.println(res);
		br.close();
	}

	private static int bfs(int x, int y) {
		ArrayDeque<int[]> q=new ArrayDeque<>();
		q.offer(new int[] {x,y,0});
		boolean[][] v=new boolean[N][M];
		int cnt=0;
		
		while(!q.isEmpty()) {
			int[] now=q.poll();
			if(v[now[0]][now[1]]) continue;
			v[now[0]][now[1]]=true;
			if(map[now[0]][now[1]]==1) {
				cnt=now[2];
				break;
			}
			
			for(int d=0; d<8; d++) {
				int dx=now[0]+delx[d], dy=now[1]+dely[d];
				if(dx<0||dx>=N||dy<0||dy>=M||v[dx][dy]) continue;
				q.offer(new int[] {dx,dy,now[2]+1});
			}
			
		}
		
		return cnt;
	}
	
}
