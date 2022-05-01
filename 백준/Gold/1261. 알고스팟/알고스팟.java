import java.io.*;
import java.util.*;

public class Main {

	static int[] delx= {-1, 0, 1, 0};
	static int[] dely= { 0, 1, 0,-1};
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine(), " ");

		int M=Integer.parseInt(st.nextToken());
		int N=Integer.parseInt(st.nextToken());
		int[][] map=new int[N][M];
		for(int i=0; i<N; i++) {
			char[] ca=br.readLine().toCharArray();
			for(int j=0; j<M; j++) map[i][j]=ca[j]-48;
		}
		
		int[][] dist=new int[N][M];
		for(int i=0; i<N; i++) Arrays.fill(dist[i], Integer.MAX_VALUE);
		boolean[][] v=new boolean[N][M];
		PriorityQueue<int[]> pq=new PriorityQueue<>((o1, o2)->Integer.compare(o1[2], o2[2]));
		pq.offer(new int[] {0,0,0});
		dist[0][0]=0;
		
		while(!pq.isEmpty()) {
			int[] now=pq.poll();
			
			if(v[now[0]][now[1]]) continue;
			v[now[0]][now[1]]=true;
			
			for(int d=0; d<4; d++) {
				int dx=now[0]+delx[d], dy=now[1]+dely[d];
				if(dx<0||dx>=N||dy<0||dy>=M||v[dx][dy]) continue;
				// 벽인경우
				if(map[dx][dy]==1) {
					if(dist[dx][dy]>dist[now[0]][now[1]]+1) {
						dist[dx][dy]=dist[now[0]][now[1]]+1;
						pq.offer(new int[] {dx,dy,now[2]+1});
					}
				} 
				// 벽이 아닌경우
				else {
					if(dist[dx][dy]>dist[now[0]][now[1]]) {
						dist[dx][dy]=dist[now[0]][now[1]];
						pq.offer(new int[] {dx,dy,now[2]});
					}
				}
			}
		}
		System.out.println(dist[N-1][M-1]);
		br.close();
	}
	
}
