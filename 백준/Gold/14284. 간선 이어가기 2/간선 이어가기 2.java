import java.io.*;
import java.util.*;

public class Main {

	static class Node implements Comparable<Node> {
		int end, price;

		public Node(int end, int price) {
			super();
			this.end = end;
			this.price = price;
		}
		
		@Override
		public int compareTo(Node o) {
			return Integer.compare(price, o.price);
		}
	}
	
	static ArrayList<Node>[] g;
	static int n;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		
		g=new ArrayList[n+1];
		for(int i=1; i<=n; i++) g[i]=new ArrayList<>();
		
		for(int i=0; i<m; i++) {
			st=new StringTokenizer(br.readLine()," ");
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			int c=Integer.parseInt(st.nextToken());
			g[a].add(new Node(b, c));
			g[b].add(new Node(a, c));
		}
		
		st=new StringTokenizer(br.readLine()," ");
		int s=Integer.parseInt(st.nextToken());
		int t=Integer.parseInt(st.nextToken());
		
		System.out.println(dijkstra(s,t));
		br.close();
	}

	private static int dijkstra(int s, int t) {
		int res=0;
		
		PriorityQueue<Node> pq=new PriorityQueue<>();
		pq.offer(new Node(s, 0));
		int[] dist=new int[n+1];
		Arrays.fill(dist, 999_999);
		dist[s]=0;
		
		while(!pq.isEmpty()) {
			Node now=pq.poll();
			
			if(now.end==t) {
				res=now.price;
				break;
			}
			
			for(Node next:g[now.end]) {
				if(dist[next.end]>dist[now.end]+next.price) {
					dist[next.end]=dist[now.end]+next.price;
					pq.offer(new Node(next.end, dist[next.end]));
				}
			}
		}
		
		return res;
	}
	
}
