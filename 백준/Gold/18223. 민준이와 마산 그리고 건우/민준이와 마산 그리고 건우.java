import java.io.*;
import java.util.*;

public class Main {

	static class Node implements Comparable<Node> {
		int end, price;

		public Node(int end, int price) {
			this.end = end;
			this.price = price;
		}

		@Override
		public int compareTo(Node o) {
			return Integer.compare(price, o.price);
		}
	}
	
	static int[] dist;
	static ArrayList<Node>[] g;

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");

		int V=Integer.parseInt(st.nextToken());
		int E=Integer.parseInt(st.nextToken());
		int P=Integer.parseInt(st.nextToken());
		
		g=new ArrayList[V+1];
		for(int i=1; i<=V; i++) g[i]=new ArrayList<>();
		dist=new int[V+1];
		
		for(int i=0; i<E; i++) {
			st=new StringTokenizer(br.readLine()," ");
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			int c=Integer.parseInt(st.nextToken());
			
			g[a].add(new Node(b, c));
			g[b].add(new Node(a, c));
		}
		
		int res1 = dijkstra(1, V);
		int res2 = dijkstra(1, P)+dijkstra(P, V);
		
		if(res1==res2) System.out.println("SAVE HIM");
		else System.out.println("GOOD BYE");
		br.close();
	}

	private static int dijkstra(int start, int end) {
		int res=0;
		Arrays.fill(dist, 999_999);
		PriorityQueue<Node> pq=new PriorityQueue<>();
		dist[start]=0;
		pq.offer(new Node(start, 0));
		
		while(!pq.isEmpty()) {
			Node now=pq.poll();
			
			if(now.end==end) {
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
