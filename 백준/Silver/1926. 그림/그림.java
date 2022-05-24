import java.io.*;
import java.util.*;

public class Main {

	static int[] delx= {-1, 0, 1, 0};
	static int[] dely= { 0, 1, 0,-1};
	static int[][] map;
	static int cnt, size, n, m;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		map=new int[n][m];
		
		for(int i=0; i<n; i++) {
			st=new StringTokenizer(br.readLine()," ");
			for (int j=0; j<m; j++) map[i][j]=Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<n; i++) {
			for (int j=0; j<m; j++)
				if(map[i][j]==1) {
					cnt++;
					bfs(i,j);
				}
		}
		System.out.println(cnt);
		System.out.println(size);
		br.close();
	}

	static void bfs(int i, int j) {
		map[i][j]=2;
		
		int sz=1;
		ArrayDeque<int[]> q=new ArrayDeque<>();
		q.offer(new int[] {i,j});
		while(!q.isEmpty()) {
			int[] now=q.poll();
			
			for(int d=0; d<4; d++) {
				int dx=now[0]+delx[d], dy=now[1]+dely[d];
				if(dx<0||dx>=n||dy<0||dy>=m||map[dx][dy]==2||map[dx][dy]==0) continue;
				sz++;
				map[dx][dy]=2;
				q.offer(new int[] {dx,dy});
			}
		}
		size=Math.max(size, sz);
	}
	
}
