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
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		ArrayList<Node>[] g=new ArrayList[N+1];
		for(int i=1; i<=N; i++) g[i]=new ArrayList<>();
		
		for(int i=0; i<M; i++) {
			st=new StringTokenizer(br.readLine()," ");
			int s=Integer.parseInt(st.nextToken());
			int e=Integer.parseInt(st.nextToken());
			int p=Integer.parseInt(st.nextToken());
			
			g[s].add(new Node(e, p));
			g[e].add(new Node(s, p));
		}
		
		int[] dist=new int[N+1];
		int[] res=new int[N+1];
		Arrays.fill(dist, 999_999);
		PriorityQueue<Node> pq=new PriorityQueue<>();
		pq.add(new Node(1, 0));
		dist[1]=0;
		
		
		StringBuilder sb=new StringBuilder();
		while(!pq.isEmpty()) {
			Node now=pq.poll();
			
			for(Node next:g[now.end]) {
				if(dist[next.end]>now.price+next.price) {
					dist[next.end]=now.price+next.price;
					res[next.end]=now.end;
					pq.add(new Node(next.end, now.price+next.price));
				}
			}
		}
		
		System.out.println(N-1);
		for(int i=2; i<=N; i++) sb.append(i).append(" ").append(res[i]).append("\n");
		System.out.println(sb.toString());
		br.close();
	}
	
}
