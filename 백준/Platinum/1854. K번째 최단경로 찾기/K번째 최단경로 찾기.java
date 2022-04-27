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
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		
		PriorityQueue<Integer>[] dist=new PriorityQueue[n+1];
		ArrayList<Node>[] g=new ArrayList[n+1];
		for(int i=0; i<=n; i++) {
			dist[i]=new PriorityQueue<>(k,(o1, o2)->-Integer.compare(o1, o2));
			g[i]=new ArrayList<>();
		}
		
		for(int i=0; i<m; i++) {
			st=new StringTokenizer(br.readLine()," ");
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			int c=Integer.parseInt(st.nextToken());
			g[a].add(new Node(b, c));
		}
		
		PriorityQueue<Node> pq=new PriorityQueue<>();
		pq.offer(new Node(1, 0));
		dist[1].add(0);
		
		while(!pq.isEmpty()) {
			Node now=pq.poll();
			
			for(Node next:g[now.end]) {
				if(dist[next.end].size()<k) {
					dist[next.end].offer(now.price+next.price);
					pq.offer(new Node(next.end, now.price+next.price));
				} else if(dist[next.end].peek()>now.price+next.price) {
					dist[next.end].poll();
					dist[next.end].offer(now.price+next.price);
					pq.offer(new Node(next.end, now.price+next.price));
				}
			}
		}
		
		for(int i=1; i<=n; i++) {
			if(dist[i].size()<k) System.out.println(-1);
			else System.out.println(dist[i].poll());
		}
		br.close();
	}
	
}
