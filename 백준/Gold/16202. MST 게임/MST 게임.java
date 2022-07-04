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
	
	static int N,M,K;
	static int[] parent;
	static ArrayList<Edge> g=new ArrayList<>();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		K=Integer.parseInt(st.nextToken());
		
		for(int i=1; i<=M; i++) {
			st=new StringTokenizer(br.readLine()," ");
			int s=Integer.parseInt(st.nextToken());
			int e=Integer.parseInt(st.nextToken());
			g.add(new Edge(s, e, i));
		}
		
		StringBuilder sb=new StringBuilder();
		int res=-1, sum=0, cnt=0;
		for(int i=0; i<K; i++) {
			if(res==0) {
				sb.append(0).append(" ");
				continue;
			}
			
			res=0; sum=0; cnt=0;
			makeSet();
			PriorityQueue<Edge> pq=new PriorityQueue<>();
			for(int j=0; j<g.size(); j++) pq.offer(g.get(j));

			while(!pq.isEmpty()) {
				Edge now=pq.poll();
				
				if(!union(now.start, now.end)) {
					sum+=now.price;
					if(++cnt>=N-1) {
						res=sum;
						break;
					}
				}
			}
			g.remove(0);
			sb.append(res).append(" ");
		}
		System.out.println(sb.toString());
		br.close();
	}
	
	static boolean union(int a, int b) {
		a=find(a);
		b=find(b);
		if(find(a)==find(b)) return true;
		parent[b]=a;
		return false;
	}
	
	static int find(int a) {
		if(a==parent[a]) return a;
		return parent[a]=find(parent[a]);
	}

	static void makeSet() {
		parent=new int[N+1];
		for(int i=1; i<=N; i++) parent[i]=i;
	}
	
}
