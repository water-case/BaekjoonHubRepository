import java.io.*;
import java.util.*;

public class Main {

	static int[] delx= {-1,-1, 0, 1, 1, 1, 0,-1}; // 12시부터 시계방향
	static int[] dely= { 0, 1, 1, 1, 0,-1,-1,-1};
	static int ans=0, M,N;
	static int[][] map;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		M=Integer.parseInt(st.nextToken());
		N=Integer.parseInt(st.nextToken());
		
		map=new int[M][N];
		
		for(int i=0; i<M; i++) {
			st=new StringTokenizer(br.readLine()," ");
			for(int j=0; j<N; j++) map[i][j]=Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<M; i++)
			for(int j=0; j<N; j++)
				if(map[i][j]==1) {
					ans++;
					bfs(i,j);
				}
		
		System.out.println(ans);
		br.close();
	}
	
	static void bfs(int i, int j) {
		ArrayDeque<int[]> q=new ArrayDeque<>();
		q.offer(new int[] {i,j});
		map[i][j]=0;
		while(!q.isEmpty()) {
			int[] now=q.poll();
			
			for(int d=0; d<8; d++) {
				int dx=now[0]+delx[d], dy=now[1]+dely[d];
				if(dx<0||dx>=M||dy<0||dy>=N||map[dx][dy]==0) continue;
				q.offer(new int[] {dx, dy});
				map[dx][dy]=0;
			}
		}
	}
	
}
