import java.io.*;
import java.util.*;

public class Main {

	static int N,M,K;
	static int[][] map;
	static int[] delx= {-1, 0, 1, 0};
	static int[] dely= { 0, 1, 0,-1};
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		K=Integer.parseInt(st.nextToken());
		
		map=new int[N][M];
		
		for(int i=0; i<K; i++) {
			st=new StringTokenizer(br.readLine()," ");
			int r=Integer.parseInt(st.nextToken())-1;
			int c=Integer.parseInt(st.nextToken())-1;
			map[r][c]=1;
		}
		
		int ans=0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(map[i][j]==1) 
					ans=Math.max(ans, dfs(i,j,1,new boolean[N][M]));
			}
		}
		
		System.out.println(ans);
		br.close();
	}

	static int dfs(int i, int j, int cnt, boolean[][] v) {
		if(v[i][j]) return cnt;
		v[i][j]=true;
		
		for(int d=0; d<4; d++) {
			int dx=i+delx[d], dy=j+dely[d];
			if(dx<0||dx>=N||dy<0||dy>=M||v[dx][dy]||map[dx][dy]==0) continue;
			cnt=dfs(dx,dy,cnt+1,v);
		}
		
		return cnt;
	}
	
}
