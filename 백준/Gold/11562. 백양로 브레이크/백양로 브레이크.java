import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		
		int[][] g=new int[n+1][n+1];
		for(int i=0; i<=n; i++) Arrays.fill(g[i], 999_999);
		for(int i=1; i<=n; i++) g[i][i]=0;
		for(int i=0; i<m; i++) {
			st=new StringTokenizer(br.readLine());
			int u=Integer.parseInt(st.nextToken());
			int v=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			
			g[u][v]=0;
			if(b==1)
				g[v][u]=0;
			else
				g[v][u]=1;
		}
		
		for(int k=1; k<=n; k++) {
			for(int i=1; i<=n; i++) {
				if(k==i) continue;
				for(int j=1; j<=n; j++) {
					if(j==k || j==i) continue;
					if(g[i][j] > g[i][k]+g[k][j])
					   g[i][j] = g[i][k]+g[k][j];
				}
			}
		}
		
		StringBuilder sb=new StringBuilder();
		int k=Integer.parseInt(br.readLine());
		for(int i=0; i<k; i++) {
			st=new StringTokenizer(br.readLine());
			int s=Integer.parseInt(st.nextToken());
			int e=Integer.parseInt(st.nextToken());
			sb.append(g[s][e]).append("\n");
		}
		System.out.println(sb.toString());
		br.close();
	}
	
}
