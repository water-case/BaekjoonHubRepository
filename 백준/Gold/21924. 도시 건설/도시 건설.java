import java.io.*;
import java.util.*;

public class Main {

	static class Edge implements Comparable<Edge> {
		int start, end, price;

		public Edge(int start, int end, int price) {
			this.start = start;
			this.end = end;
			this.price = price;
		}
		
		@Override
		public int compareTo(Edge o) {
			return Integer.compare(price, o.price);
		}
	}
	
	static int[] parent;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int N=Integer.parseInt(st.nextToken()); // 건물의 개수
		int M=Integer.parseInt(st.nextToken()); // 도로의 개수
		
		parent=new int[N+1];
		for(int i=0; i<=N; i++) parent[i]=i;
		long total=0;
		PriorityQueue<Edge> pq=new PriorityQueue<>();
		for(int i=0; i<M; i++) {
			st=new StringTokenizer(br.readLine()," ");
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			int c=Integer.parseInt(st.nextToken());
			total+=c;
			pq.offer(new Edge(a, b, c));
		}
		
		int cnt=0;
		long price=0;
		boolean end=false;
		while(!pq.isEmpty()) {
			Edge now=pq.poll();
			if(!isUnion(now.start, now.end)) {
				price+=now.price;
				if(++cnt==N-1) {
					end=true;
					break;
				}
			}
		}
		
		if(end) System.out.println(total-price);
		else System.out.println(-1);

		br.close();
	}
	
	static int find(int a) {
		if(a==parent[a]) return a;
		return parent[a]=find(parent[a]);
	}
	
	static boolean isUnion(int a, int b) {
		a=find(a);
		b=find(b);
		if(find(a)==find(b)) return true;
		parent[b]=a;
		return false;
	}
	
}
