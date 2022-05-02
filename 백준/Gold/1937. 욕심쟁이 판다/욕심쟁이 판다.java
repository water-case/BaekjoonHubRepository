import java.io.*;
import java.util.*;

public class Main {

	static int[] delx= {-1, 0, 1, 0};
	static int[] dely= { 0, 1, 0,-1};
	static int n;
	static int[][] map;
	static Integer[][] memo;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		n=Integer.parseInt(br.readLine());
		map=new int[n][n];
		memo=new Integer[n][n];
		
		for(int i=0; i<n; i++) {
			st=new StringTokenizer(br.readLine()," ");
			for(int j=0; j<n; j++) map[i][j]=Integer.parseInt(st.nextToken());
		}
		
		int ans=0;
		for(int i=0; i<n; i++)
			for(int j=0; j<n; j++) {
				int r=dfs(i,j,map[i][j]);
				ans=Math.max(ans, r);
			}
				
		System.out.println(ans);
		br.close();
	}

	static int dfs(int i, int j, int num) {
		if(memo[i][j]==null) {
			memo[i][j]=1;
			for(int d=0; d<4; d++) {
				int dx=i+delx[d], dy=j+dely[d];
				if(dx<0||dx>=n||dy<0||dy>=n) continue;
				if(map[dx][dy]>num) { // 이전 지역보다 대나무가 많을경우
					int n=dfs(dx,dy,map[dx][dy])+1;
					memo[i][j]=Math.max(memo[i][j], n);
				}
			}
		}
		
		return memo[i][j];
	}
	
}
