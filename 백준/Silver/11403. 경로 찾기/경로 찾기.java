import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N=Integer.parseInt(br.readLine());
		int[][] g=new int[N][N];
		
		for(int i=0; i<N; i++) {
			st=new StringTokenizer(br.readLine()," ");
			for(int j=0; j<N; j++) {
				g[i][j]=Integer.parseInt(st.nextToken());
				if(g[i][j]==0)
					g[i][j]=999_999;
			}
		}
		
		for(int k=0; k<N; k++) {
			for(int i=0; i<N; i++) {
				if(k==i) continue;
				for(int j=0; j<N; j++) {
					if(i==k || k==j) continue;
					if(g[i][j] > g[i][k]+g[k][j])
						g[i][j]=g[i][k]+g[k][j];
				}
			}
		}
		
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				sb.append(g[i][j]!=999_999?1:0).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
		
		br.close();
	}
	
}
