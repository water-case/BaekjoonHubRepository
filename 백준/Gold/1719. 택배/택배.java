import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		
		int[][] g=new int[n+1][n+1];
		int[][] ans=new int[n+1][n+1];
		
		for(int i=0; i<=n; i++) Arrays.fill(g[i], 999_999);
		
		for(int i=0; i<m; i++) {
			st=new StringTokenizer(br.readLine()," ");
			int s=Integer.parseInt(st.nextToken());
			int e=Integer.parseInt(st.nextToken());
			int p=Integer.parseInt(st.nextToken());
			g[s][e]=p;
			g[e][s]=p;
			ans[s][e]=e;
			ans[e][s]=s;
		}
		
		for(int k=1; k<=n; k++) {
			for(int i=1; i<=n; i++) {
				if(k==i) continue;
				for(int j=1; j<=n; j++) {
					if(j==k || j==i) continue;
					if(g[i][j]>g[i][k]+g[k][j]) {
					   g[i][j]=g[i][k]+g[k][j];
					   ans[i][j]=ans[i][k];
					}
				}
			}
		}
		
		StringBuilder sb=new StringBuilder();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(ans[i][j]==0)
					sb.append("-").append(" ");
				else 
					sb.append(ans[i][j]).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
		br.close();
	}
	
}
