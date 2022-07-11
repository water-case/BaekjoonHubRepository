import java.io.*;
import java.util.*;

public class Main {

	static int N;
	static int[][] g;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		g=new int[N+1][N+1];
		for(int i=1; i<=N; i++) Arrays.fill(g[i], 999_999);
		while(M-->0) {
			st=new StringTokenizer(br.readLine()," ");
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			g[a][b]=g[b][a]=1;
		}
		for(int i=1; i<=N; i++) g[i][i]=0;
		
		for(int k=1; k<=N; k++) {
			for(int i=1; i<=N; i++) {
				if(k==i) continue;
				for(int j=1; j<=N; j++) {
					if(j==k || j==i) continue;
					g[i][j]=Math.min(g[i][j], g[i][k]+g[k][j]);
				}
			}
		}
		
		int a1=-1, a2=-1, ans=Integer.MAX_VALUE;
		for(int i=1; i<=N; i++) {
			for(int j=i+1; j<=N; j++) {
				int sum=sumDist(i,j);
				if(ans > sum) {
					a1=i;
					a2=j;
					ans=sum;
				}
			}
		}
		
		System.out.println(a1+" "+a2+" "+ans*2);
		br.close();
	}

	static int sumDist(int a, int b) {
		int res=0;
		
		for(int i=1; i<=N; i++) {
			res += Math.min(g[a][i], g[b][i]);
		}
		
		return res;
	}
	
}
