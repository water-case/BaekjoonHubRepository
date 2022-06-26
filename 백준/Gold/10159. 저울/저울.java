import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N=Integer.parseInt(br.readLine()); // 물건의 개수
		int M=Integer.parseInt(br.readLine()); // 미리 측정된 물건 쌍의 개수
		
		int[][] g=new int[N+1][N+1];
		for(int i=0; i<M; i++) {
			st=new StringTokenizer(br.readLine(), " ");
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			g[a][b]=1;
		}
		
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				if(i!=j && g[i][j]==0) g[i][j]=999_999;
			}
		}
		
		for(int k=1; k<=N; k++) {
			for(int i=1; i<=N; i++) {
				if(i==k) continue;
				for(int j=1; j<=N; j++) {
					if(j==i || j==k) continue;
					if(g[i][j]>g[i][k]+g[k][j])
						g[i][j]=g[i][k]+g[k][j];
				}
			}
		}
		
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				if(i==j) continue;
				if(g[i][j]!=999_999) g[j][i]=g[i][j];
			}
		}
		
		StringBuilder sb=new StringBuilder();
		for(int i=1; i<=N; i++) {
			int cnt=0;
			for(int j=1; j<=N; j++) {
				if(g[i][j]==999_999) cnt++;
			}
			sb.append(cnt).append("\n");
		}
		System.out.println(sb.toString());
		br.close();
	}
	
}
