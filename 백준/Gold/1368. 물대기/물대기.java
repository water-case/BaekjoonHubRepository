import java.io.*;
import java.util.*;

public class Main {

	static class Edge implements Comparable<Edge> {
		int start, end, price;

		public Edge(int start, int end, int price) {
			super();
			this.start = start;
			this.end = end;
			this.price = price;
		}
		
		@Override
		public int compareTo(Edge o) {
			return Integer.compare(price, o.price);
		}
	}
	
	static int N;
	static int[] parent;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N=Integer.parseInt(br.readLine());
		
		makeSet();
		
		PriorityQueue<Edge> pq=new PriorityQueue<>();
		for(int i=1; i<=N; i++) {
			pq.offer(new Edge(0, i, Integer.parseInt(br.readLine())));
		}
		for(int i=1; i<=N; i++) {
			st=new StringTokenizer(br.readLine()," ");
			for(int j=1; j<=N; j++) {
				int n=Integer.parseInt(st.nextToken());
				if(n!=0) {
					pq.offer(new Edge(i, j, n));
				}
			}
		}
		
		int res=0, cnt=0;
		while(!pq.isEmpty()) {
			Edge now=pq.poll();
			if(!union(now.start, now.end)) {
				res+=now.price;
				if(cnt++==N)
					break;
			}
		}
		
		System.out.println(res);
		br.close();
	}
	
	static void makeSet() {
		parent=new int[N+1];
		for(int i=0; i<=N; i++)
			parent[i]=i;
	}
	
	static int find(int a) {
		if(a==parent[a]) return a;
		return parent[a]=find(parent[a]);
	}
	
	static boolean union(int a, int b) {
		a=find(a);
		b=find(b);
		if(find(a)==find(b)) return true;
		parent[b]=a;
		return false;
	}
	
}
