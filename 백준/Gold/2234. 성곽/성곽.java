import java.io.*;
import java.util.*;

public class Main {

	static int[] delx= { 0,-1, 0, 1}; // 좌상우하
	static int[] dely= {-1, 0, 1, 0};
	static int N,M;
	static int[] size;
	static int[][] map, map2;
	static boolean[][] v;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		map=new int[M][N]; // 최초 주어진 맵
		map2=new int[M][N]; // 간략화한 맵
		size=new int[N*M+1];
		
		for(int i=0; i<M; i++) {
			st=new StringTokenizer(br.readLine()," ");
			for(int j=0; j<N; j++)
				map[i][j]=Integer.parseInt(st.nextToken());
		}
		
		int team=1;
		int max=-1;
		
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				if(map2[i][j]==0) {
					ArrayDeque<int[]> q=new ArrayDeque<>();
					q.offer(new int[] {i,j});
					v=new boolean[M][N];
					v[i][j]=true;
					map2[i][j]=team;
					int cnt=0;
					while(!q.isEmpty()) {
						int[] now=q.poll();
						cnt++;
						
						for(int d=0; d<4; d++) {
							int dx=now[0]+delx[d], dy=now[1]+dely[d];
							if(((1<<d) & map[now[0]][now[1]])>0 || dx<0||dx>=M||dy<0||dy>=N || v[dx][dy]) continue;
							v[dx][dy]=true;
							map2[dx][dy]=team;
							q.offer(new int[] {dx, dy});
						}
					}
					max=Math.max(max, cnt);
					size[team]=cnt;
					team++;
				}
			}
		}
		
		int rmMax=0;
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				for(int d=0; d<4; d++) {
					int dx=i+delx[d], dy=j+dely[d];
					if(dx<0||dx>=M||dy<0||dy>=N ) continue;
					if(map2[i][j] != map2[dx][dy]) {
						int rm=size[map2[i][j]] + size[map2[dx][dy]];
						rmMax=Math.max(rmMax, rm);
					}
				}
			}
		}
		
		System.out.println(team-1); // 방의 개수
		System.out.println(max); // 가장 큰 방의 넓이
		System.out.println(rmMax); // 하나의 벽을 제거하여 얻을 수 있는 가장 큰 넓이

		br.close();
	}
	
}
