import java.io.*;
import java.util.*;

public class Main {

	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");

		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		int X=Integer.parseInt(st.nextToken());
		
		ArrayList<Integer>[] g=new ArrayList[N+1];
		for(int i=1; i<=N; i++) g[i]=new ArrayList<>();
		boolean[] v=new boolean[N+1];
		int[] dist=new int[N+1];
		Arrays.fill(dist, Integer.MAX_VALUE);
		
		for(int i=0; i<M; i++) {
			st=new StringTokenizer(br.readLine()," ");
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			g[a].add(b);
		}
		
		ArrayDeque<int[]> q=new ArrayDeque<>();
		dist[X]=0;
		q.offer(new int[] {X, 0});
		
		while(!q.isEmpty()) {
			int[] now=q.poll();
			
			if(v[now[0]]) continue;
			v[now[0]]=true;
			
			for(int next:g[now[0]]) {
				if(!v[next] && dist[next]>dist[now[0]]+1) {
							   dist[next]=dist[now[0]]+1;
							   q.offer(new int[] {next, dist[next]});
				}
			}
		}
		
		int cnt=0;
		StringBuilder sb=new StringBuilder();
		for(int i=1; i<=N; i++) {
			if(dist[i]==K) {
				sb.append(i).append("\n");
				cnt++;
			}
		}
		if(cnt==0) System.out.println(-1);
		System.out.println(sb.toString());
		br.close();
	}
	
}
