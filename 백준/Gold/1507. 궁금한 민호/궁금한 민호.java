import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N=Integer.parseInt(br.readLine());
		int[][] g=new int[N][N];
		int[][] g2=new int[N][N];
		
		for(int i=0; i<N; i++) {
			st=new StringTokenizer(br.readLine()," ");
			for(int j=0; j<N; j++) {
				g[i][j]=Integer.parseInt(st.nextToken());
				g2[i][j]=g[i][j];
			}
		}
		
		for(int k=0; k<N; k++) {
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if(i==j || i==k || j==k) continue;
					
					if(g[i][j] > g[i][k]+g[k][j]) {
						System.out.println(-1);
						return;
					}
					
					if(g[i][j] == g[i][k]+g[k][j])
						g2[i][j]=999_999;
				}
			}
		}

		int ans=0;
		boolean[][] v=new boolean[N][N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(g2[i][j] != 999_999 && i!=j && !v[i][j]) {
					ans+=g2[i][j];
					v[i][j]=v[j][i]=true;
				}
			}
		}
		
		System.out.println(ans);
		br.close();
	}
	
}
