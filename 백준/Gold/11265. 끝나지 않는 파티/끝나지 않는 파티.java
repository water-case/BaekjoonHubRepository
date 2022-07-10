import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		int[][] g=new int[N][N];
		for(int i=0; i<N; i++) {
			st=new StringTokenizer(br.readLine()," ");
			for(int j=0; j<N; j++) {
				g[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		for(int k=0; k<N; k++) {
			for(int i=0; i<N; i++) {
				if(k==i) continue;
				for(int j=0; j<N; j++) {
					if(j==k || j==i) continue;
					if( g[i][j]>g[i][k]+g[k][j]) {
						g[i][j]=g[i][k]+g[k][j];
					}
				}
			}
		}
		
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<M; i++) {
			st=new StringTokenizer(br.readLine()," ");
			int A=Integer.parseInt(st.nextToken())-1;
			int B=Integer.parseInt(st.nextToken())-1;
			int C=Integer.parseInt(st.nextToken());
			
			if(g[A][B]>C) sb.append("Stay here");
			else sb.append("Enjoy other party");
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
	
}
