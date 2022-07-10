import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		StringBuilder sb=new StringBuilder();
		int T=Integer.parseInt(br.readLine());
		for(int tc=1; tc<=T; tc++) {
			st=new StringTokenizer(br.readLine()," ");
			int N=Integer.parseInt(st.nextToken()); // 방의 개수
			int M=Integer.parseInt(st.nextToken()); // 비밀통로의 개수
			
			int[][] g=new int[N+1][N+1];
			for(int i=0; i<=N; i++)
				Arrays.fill(g[i], 999_999);
			
			for(int i=0; i<M; i++) {
				st=new StringTokenizer(br.readLine()," ");
				int a=Integer.parseInt(st.nextToken());
				int b=Integer.parseInt(st.nextToken());
				int c=Integer.parseInt(st.nextToken());
				g[a][b]=g[b][a]=c;
			}
			
			ArrayList<Integer> join=new ArrayList<>();
			int K=Integer.parseInt(br.readLine());
			st=new StringTokenizer(br.readLine()," ");
			for(int i=0; i<K; i++) {
				join.add(Integer.parseInt(st.nextToken()));
			}
			
			for(int k=1; k<=N; k++) {
				for(int i=1; i<=N; i++) {
					if(k==i) continue;
					for(int j=1; j<=N; j++) {
						if(j==k || j==i) continue;
						if(g[i][j]>g[i][k]+g[k][j])
						   g[i][j]=g[i][k]+g[k][j];
					}
				}
			}
			
			int min=Integer.MAX_VALUE, idx=-1;
			for(int i=1; i<=N; i++) {
				int sum=0;
				for(Integer n:join) {
					if(g[i][n]==999_999) continue;
					sum+=g[i][n];
				}
				if(min>sum) {
					min=sum;
					idx=i;
				}
			}
			sb.append(idx).append("\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
	
}
