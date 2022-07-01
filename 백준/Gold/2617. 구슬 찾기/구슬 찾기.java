import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken()); // 구슬개수 1부터
		int M=Integer.parseInt(st.nextToken()); // 무게 쌍
		
		int[][] g=new int[N+1][N+1];
		for(int i=0; i<=N; i++) Arrays.fill(g[i], 999_999);
		for(int i=0; i<M; i++) {
			st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			
			g[a][b]=1;
		}
		
		for(int k=1; k<=N; k++) {
			for(int i=1; i<=N; i++) {
				if(i==k) continue;
				for(int j=1; j<=N; j++) {
					if(k==j || i==j) continue;
					if(g[i][j] > g[i][k]+g[k][j])
						g[i][j] = g[i][k]+g[k][j];
				}
			}
		}

		int ans=0;
		for(int i=1; i<=N; i++) {
			int cnt=0;
			for(int j=1; j<=N; j++) {
				if(g[i][j]!=999_999) cnt++; 
			}
			if(cnt>=(N+1)/2) ans++;
		}
		for(int i=1; i<=N; i++) {
			int cnt=0;
			for(int j=1; j<=N; j++) {
				if(g[j][i]!=999_999) cnt++; 
			}
			if(cnt>=(N+1)/2) ans++;
		}
		System.out.println(ans);
		br.close();
	}
	
}
