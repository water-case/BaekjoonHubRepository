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
	static int N;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");

		N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		g=new ArrayList[N+1];
		for(int i=1; i<=N; i++) g[i]=new ArrayList<>();
		for(int i=0; i<M; i++) {
			st=new StringTokenizer(br.readLine()," ");
			int ai=Integer.parseInt(st.nextToken());
			int bi=Integer.parseInt(st.nextToken());
			int ci=Integer.parseInt(st.nextToken());
			
			g[ai].add(new Node(bi, ci));
			g[bi].add(new Node(ai, ci));
		}
		
		System.out.println(dijkstra(1, N));
		br.close();
	}
	
	private static int dijkstra(int start, int end) {
		int res=0;
		
		PriorityQueue<Node> pq=new PriorityQueue<>();
		int[] dist=new int[N+1];
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[1]=0;
		pq.offer(new Node(1, 0));
		
		while(!pq.isEmpty()) {
			Node now=pq.poll();
			
			if(now.end==N) {
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
