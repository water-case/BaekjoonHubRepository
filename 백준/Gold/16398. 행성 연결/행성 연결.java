import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N=Integer.parseInt(br.readLine());
		int[][] g=new int[N][N];
		for(int i=0; i<N; i++) {
			st=new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<N; j++)
				g[i][j]=Integer.parseInt(st.nextToken());
		}

		long ans=0;
		boolean[] v=new boolean[N];
		int[] dist=new int[N];
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[0]=0;
		
		for(int c=0; c<N; c++) {
			int min=Integer.MAX_VALUE;
			int minV=0;
			
			for(int i=0; i<N; i++) {
				if(!v[i] && min>dist[i]) {
					min=dist[i];
					minV=i;
				}
			}
			
			v[minV]=true;
			ans+=min;
			
			for(int i=0; i<N; i++) {
				if(!v[i] && g[minV][i]!=0 && dist[i]>g[minV][i]) {
					dist[i]=g[minV][i];
				}
			}
		}
		System.out.println(ans);
		br.close();
	}
	
}
