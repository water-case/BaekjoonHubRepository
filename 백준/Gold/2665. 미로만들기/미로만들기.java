import java.io.*;
import java.util.*;

public class Main {
	
	static int[] delx= {-1, 0, 1, 0};
	static int[] dely= { 0, 1, 0,-1};

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		int[][] map=new int[n][n];
		
		for(int i=0; i<n; i++) {
			char[] ca=br.readLine().toCharArray();
			for(int j=0; j<n; j++) map[i][j]=ca[j]-48;
		}
		
		int[][] dist=new int[n][n];
		for(int i=0; i<n; i++) Arrays.fill(dist[i], Integer.MAX_VALUE);
		boolean[][] v=new boolean[n][n];
		
		PriorityQueue<int[]> pq=new PriorityQueue<>((o1,o2)->Integer.compare(o1[2], o2[2]));
		pq.offer(new int[] {0,0,0});
		dist[0][0]=0;
		
		while(!pq.isEmpty()) {
			int[] now=pq.poll();
			
			if(v[now[0]][now[1]]) continue;
			v[now[0]][now[1]]=true;
			
			for(int d=0; d<4; d++) {
				int dx=now[0]+delx[d], dy=now[1]+dely[d];
				if(dx<0||dx>=n||dy<0||dy>=n||v[dx][dy]) continue;
				
				// 흰방
				if(map[dx][dy]==1) {
					if(dist[dx][dy]>dist[now[0]][now[1]]) {
						dist[dx][dy]=dist[now[0]][now[1]];
						pq.offer(new int[] {dx,dy,now[2]});
					}
				}
				// 검은방
				else {
					if(dist[dx][dy]>dist[now[0]][now[1]]+1) {
						dist[dx][dy]=dist[now[0]][now[1]]+1;
						pq.offer(new int[] {dx,dy,now[2]+1});
					}
				}
			}
		}
		System.out.println(dist[n-1][n-1]);
		br.close();
	}
	
}
