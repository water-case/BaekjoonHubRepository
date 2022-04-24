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
			return Integer.compare(this.price, o.price);
		}
	}
	
	static int[] parent;

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());

		parent=new int[N+1];
		for(int i=0; i<=N; i++) parent[i]=i;

		// 발전소를 하나의 집합으로 묶어서 서로 연결되지 않도록한다
		st=new StringTokenizer(br.readLine()," ");
		for(int i=0; i<K; i++) parent[Integer.parseInt(st.nextToken())]=0;
		
		PriorityQueue<Edge> pq=new PriorityQueue<>();
		for(int i=0; i<M; i++) {
			st=new StringTokenizer(br.readLine()," ");
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			int c=Integer.parseInt(st.nextToken());
			pq.offer(new Edge(a, b, c));
		}
		
		int cnt=0;
		int ans=0;
		while(!pq.isEmpty()) {
			Edge now=pq.poll();
			
			if(cnt==N-K) break;
			
			if(!Union(now.start, now.end)) {
				cnt++;
				ans+=now.price;
			}
		}
		System.out.println(ans);
		br.close();
	}
	
	static int find(int a) {
		if(a==parent[a]) return a;
		return parent[a]=find(parent[a]);
	}
	
	static boolean Union(int a, int b) {
		a=find(a);
		b=find(b);
		if(find(a)==find(b)) return true;
		parent[b]=a;
		return false;
	}
	
}
