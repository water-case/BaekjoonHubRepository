import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		StringBuilder sb=new StringBuilder();
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		ArrayList<int[]>[] g=new ArrayList[N+1];
		for(int i=1; i<=N; i++) g[i]=new ArrayList<>();
		
		for(int i=0; i<N-1; i++) {
			st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			int c=Integer.parseInt(st.nextToken());
			g[a].add(new int[] {b, c});
			g[b].add(new int[] {a, c});
		}
		
		for(int i=0; i<M; i++) {
			st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			ArrayDeque<int[]> q=new ArrayDeque<>();
			q.offer(new int[] {a,0});
			boolean[] v=new boolean[N+1];
			while(true) {
				int[] now=q.poll();
				
				if(v[now[0]]) continue;
				v[now[0]]=true;
				if(now[0]==b) {
					sb.append(now[1]).append("\n");
					break;
				}
				
				for(int[] ia:g[now[0]]) {
					q.offer(new int[] {ia[0], now[1]+ia[1]});
				}
			}
		}
		System.out.println(sb.toString());
		br.close();
	}
	
}
