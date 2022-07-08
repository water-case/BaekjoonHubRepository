import java.io.*;
import java.util.*;

public class Main {

	static int[][] g;
	static int N;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		
		g=new int[N][N];
		for(int i=0; i<N; i++) {
			st=new StringTokenizer(br.readLine()," ");
			for(int j=0; j<N; j++) 
				g[i][j]=Integer.parseInt(st.nextToken());
		}
		
		for(int k=0; k<N; k++) {
			for(int i=0; i<N; i++) {
				if(k==i) continue;
				for(int j=0; j<N; j++) {
					if(j==k || j==i) continue;
					if(g[i][j]>g[i][k]+g[k][j])
					   g[i][j]=g[i][k]+g[k][j];
				}
			}
		}
		
		boolean[] v=new boolean[N];
		v[K]=true;
		System.out.println(dfs(K, 0, v, 1));
		
		br.close();
	}

	private static int dfs(int k, int sum, boolean[] v, int cnt) {
		if(cnt==N) return sum;
		
		int result=Integer.MAX_VALUE;
		for(int i=0; i<N; i++) {
			if(!v[i]) {
				v[i]=true;
				result=Math.min(result, dfs(i, sum+g[k][i], v, cnt+1));
				v[i]=false;
			}
		}
		
		return result;
	}
    
}
