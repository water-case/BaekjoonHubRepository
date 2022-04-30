import java.io.*;
import java.util.*;

public class Main {

	static class Edge {
		int start, end, price;

		public Edge(int start, int end, int price) {
			this.start = start;
			this.end = end;
			this.price = price;
		}
	}
	
	static int[] parent;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine(), " ");

		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		
		ArrayList<Edge> g=new ArrayList<>();
		for(int i=0; i<=M; i++) {
			st=new StringTokenizer(br.readLine()," ");
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			int c=Integer.parseInt(st.nextToken()); // 0이 오르막, 1이 내리막
			g.add(new Edge(a, b, c));
		}
		// 최선
		parent=new int[N+1];
		for(int i=0; i<=N; i++) parent[i]=i;
		Collections.sort(g, (o1, o2)->-Integer.compare(o1.price, o2.price)); // 1이 내리막이므로 최선이려면 내리막이 많아야 함
		int best=0;
		int cnt=0;
		for(Edge e:g) {
			if(!union(e.start, e.end)) {
				if(e.price==0) best+=1; // 오르막일때만 피로도 증가
				if(++cnt==N) break;
			}
		}
		
		// 최악
		parent=new int[N+1];
		for(int i=0; i<=N; i++) parent[i]=i;
		Collections.sort(g, (o1, o2)->Integer.compare(o1.price, o2.price)); // 0이 오르막이므로 최악이려면 오르막이 많아야 함
		int worst=0;
		cnt=0;
		for(Edge e:g) {
			if(!union(e.start, e.end)) {
				if(e.price==0) worst+=1;
				if(++cnt==N) break;
			}
		}
		System.out.println(worst*worst-best*best);
		br.close();
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
