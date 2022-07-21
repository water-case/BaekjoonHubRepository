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
	static int[] dist;
	static int N,M,X,Y;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");

		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		X=Integer.parseInt(st.nextToken());
		Y=Integer.parseInt(st.nextToken());
		
		g=new ArrayList[N];
		for(int i=0; i<N; i++) g[i]=new ArrayList<>(); 
		
		for(int i=0; i<M; i++) {
			st=new StringTokenizer(br.readLine()," ");
			int A=Integer.parseInt(st.nextToken());
			int B=Integer.parseInt(st.nextToken());
			int C=Integer.parseInt(st.nextToken());
			
			g[A].add(new Node(B, C));
			g[B].add(new Node(A, C));
		}
		
		dist=new int[N];
		Arrays.fill(dist, 999_999);
		dijkstra();
		
		Arrays.sort(dist);
		System.out.println(ans());
		br.close();
	}

	private static int ans() {
		if(dist[N-1]*2 > X) return -1;
		int day=0, idx=0, walk=0;
		while(idx<N) {
			while(idx<N && walk+dist[idx]*2<=X) {
				walk+=dist[idx++]*2;
			}
			walk=0;
			day++;
		}
		return day;
	}

	private static void dijkstra() {
		PriorityQueue<Node> pq=new PriorityQueue<>();
		pq.offer(new Node(Y, 0));
		dist[Y]=0;
		
		while(!pq.isEmpty()) {
			Node now=pq.poll();
			
			for(Node next:g[now.end]) {
				if(dist[next.end]>dist[now.end]+next.price) {
					dist[next.end]=dist[now.end]+next.price;
					pq.offer(new Node(next.end, dist[next.end]));
				}
			}
		}
	}
	
}
