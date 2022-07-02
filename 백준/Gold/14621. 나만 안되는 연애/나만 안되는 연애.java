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
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		N=Integer.parseInt(st.nextToken()); // 학교의 수
		int M=Integer.parseInt(st.nextToken()); // 도로의 수
		
		boolean[] MW=new boolean[N+1]; // 0남초 1여초
		st=new StringTokenizer(br.readLine());
		for(int i=1; i<=N; i++) {
			if(st.nextToken().equals("W")) {
				MW[i]=true;
			}
		}
		
		parent=new int[N+1];
		for(int i=1; i<=N; i++) parent[i]=i;
		
		PriorityQueue<Edge> pq=new PriorityQueue<>();
		for(int i=0; i<M; i++) {
			st=new StringTokenizer(br.readLine());
			int s=Integer.parseInt(st.nextToken());
			int e=Integer.parseInt(st.nextToken());
			int p=Integer.parseInt(st.nextToken());
			
			pq.offer(new Edge(s, e, p));
		}
		
		int ans=-1, sum=0, cnt=0;
		while(!pq.isEmpty()) {
			Edge now=pq.poll();
			
			if(MW[now.start]!=MW[now.end] && !union(now.start, now.end)) {
				sum+=now.price;
				if(++cnt==N-1) {
					ans=sum;
					break;
				}
			}
		}
		System.out.println(ans);
		br.close();
	}
	
	static int find(int a) {
		if(a==parent[a]) return a;
		return parent[a]=find(parent[a]);
	}
	
	static boolean union(int a, int b) {
		a=find(a);
		b=find(b);
		if(parent[a]==parent[b]) return true;
		parent[b]=a;
		return false;
	}
	
}
