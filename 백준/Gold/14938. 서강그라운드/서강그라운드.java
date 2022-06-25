import java.io.*;
import java.util.*;

public class Main {

	static class Edge implements Comparable<Edge> {
		int end, price;

		public Edge(int end, int price) {
			super();
			this.end = end;
			this.price = price;
		}
		
		@Override
		public int compareTo(Edge o) {
			return Integer.compare(price, o.price);
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int n=Integer.parseInt(st.nextToken()); // 지역의 개수
		int m=Integer.parseInt(st.nextToken()); // 수색범위
		int r=Integer.parseInt(st.nextToken()); // 길의 개수
		
		int[] item=new int[n+1];
		st=new StringTokenizer(br.readLine()," ");
		for(int i=1; i<=n; i++) {
			item[i]=Integer.parseInt(st.nextToken());
		}
		
		ArrayList<Edge>[] g=new ArrayList[n+1];
		for(int i=1; i<=n; i++) g[i]=new ArrayList<>();
		for(int i=0; i<r; i++) {
			st=new StringTokenizer(br.readLine()," ");
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			int c=Integer.parseInt(st.nextToken());
			
			g[a].add(new Edge(b, c));
			g[b].add(new Edge(a, c));
		}
		
		int ans=0;
		for(int c=1; c<=n; c++) {
			boolean[] v=new boolean[n+1];
			int[] dist=new int[n+1];
			Arrays.fill(dist, Integer.MAX_VALUE);
			
			PriorityQueue<Edge> pq=new PriorityQueue<>();
			dist[c]=0;
			pq.add(new Edge(c, 0));
			
			while(!pq.isEmpty()) {
				Edge now=pq.poll();
				
				if(v[now.end]) continue;
				v[now.end]=true;
				
				for(Edge next:g[now.end]) {
					if(!v[next.end] && dist[next.end]>dist[now.end]+next.price) {
						               dist[next.end]=dist[now.end]+next.price;
						               pq.add(new Edge(next.end, dist[next.end]));
					}
				}
			}
			int res=0;
			for(int i=1; i<=n; i++) {
				if(dist[i]<=m)
					res+=item[i];
			}
			ans=Math.max(ans, res);
		}
		
		System.out.println(ans);
		br.close();
	}
	
}
