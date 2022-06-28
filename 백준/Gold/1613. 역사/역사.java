import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int n=Integer.parseInt(st.nextToken());
		int _k=Integer.parseInt(st.nextToken());
		
		int[][] g=new int[n+1][n+1];
		for(int i=1; i<=n; i++) Arrays.fill(g[i], 999_999);
		for(int i=0; i<_k; i++) {
			st=new StringTokenizer(br.readLine()," ");
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			g[a][b]=1;
		}
		
		for(int k=1; k<=n; k++) {
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=n; j++) {
					if(i==j || j==k || k==i) continue;
					
					if(g[i][j] > g[i][k]+g[k][j])
					   g[i][j] = g[i][k]+g[k][j];
				}
			}
		}
		
		int s=Integer.parseInt(br.readLine());
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<s; i++) {
			st=new StringTokenizer(br.readLine()," ");
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			
			int ans=0;
			if(g[a][b]!=999_999) ans=-1;
			else if(g[b][a]!=999_999) ans=1;
			
			sb.append(ans).append("\n");
		}
		System.out.println(sb.toString());
		br.close();
	}
	
}
