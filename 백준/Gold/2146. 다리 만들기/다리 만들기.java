import java.io.*;
import java.util.*;

public class Main {

	static int[] delx= {-1, 0, 1, 0}; // 상우하좌
	static int[] dely= { 0, 1, 0,-1};
	static int N;
	static int[][] map;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		N=Integer.parseInt(br.readLine());
		map=new int[N][N];
		for(int i=0; i<N; i++) {
			st=new StringTokenizer(br.readLine()," ");
			for(int j=0; j<N; j++) map[i][j]=Integer.parseInt(st.nextToken());
		}
		
		// 각 섬 구분만들기
		boolean[][] v=new boolean[N][N];
		ArrayDeque<int[]> q=new ArrayDeque<>();
		int cnt=1;
		for(int i=0; i<N; i++)
			for(int j=0; j<N; j++)
				if(!v[i][j] && map[i][j]==1) {
					q.offer(new int[] {i,j});
					v[i][j]=true;
					while(!q.isEmpty()) {
						int[] now=q.poll();
						map[now[0]][now[1]]=cnt;
						for(int d=0; d<4; d++) {
							int dx=now[0]+delx[d], dy=now[1]+dely[d];
							if(dx<0||dx>=N||dy<0||dy>=N||v[dx][dy]||map[dx][dy]==0) continue;
							v[dx][dy]=true;
							q.offer(new int[] {dx,dy});
						}
					}
					cnt++;
				}
		
		// 다리 만들기
		int ans=Integer.MAX_VALUE;
		
		for(int i=0; i<N; i++)
			for(int j=0; j<N; j++)
				if(map[i][j]!=0)
					for(int d=0; d<4; d++) {
						int dx=i+delx[d], dy=j+dely[d];
						if(dx<0||dx>=N||dy<0||dy>=N) continue;
						if(map[dx][dy]==0) ans=Math.min(ans, bfs(dx,dy,map[i][j]));
					}
		
		System.out.println(ans);
		br.close();
	}

	static int bfs(int x, int y, int num) {
		ArrayDeque<int[]> q=new ArrayDeque<>();
		boolean[][] v=new boolean[N][N];
		q.offer(new int[] {x,y,1});
		v[x][y]=true;
		while(!q.isEmpty()) {
			int[] now=q.poll();
			
			if(map[now[0]][now[1]]!=num && map[now[0]][now[1]]!=0) {
				return now[2]-1;
			}
			
			for(int d=0; d<4; d++) {
				int dx=now[0]+delx[d], dy=now[1]+dely[d];
				if(dx<0||dx>=N||dy<0||dy>=N||v[dx][dy]||map[dx][dy]==num) continue;
				v[dx][dy]=true;
				q.offer(new int[] {dx,dy,now[2]+1});
			}
		}
		
		return 1;
	}
	
}
