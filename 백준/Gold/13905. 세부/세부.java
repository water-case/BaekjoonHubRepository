import java.io.*;
import java.util.*;

public class Main {

	static class Node implements Comparable<Node> {
		int start, end, weight;

		public Node(int start, int end, int weight) {
			super();
			this.start = start;
			this.end = end;
			this.weight = weight;
		}
		
		@Override
		public int compareTo(Node o) {
			return -(weight-o.weight);
		}
	}
	
	static int[] parent;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		st=new StringTokenizer(br.readLine()," ");
		int s=Integer.parseInt(st.nextToken()); // 출발
		int e=Integer.parseInt(st.nextToken()); // 도착
		
		PriorityQueue<Node> pq=new PriorityQueue<>();
		for(int i=0; i<M; i++) {
			st=new StringTokenizer(br.readLine()," ");
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			int c=Integer.parseInt(st.nextToken());
			pq.offer(new Node(a, b, c));
		}
		
		parent=new int[N+1];
		for(int i=0; i<=N; i++) parent[i]=i;
		
		int ans=0;
		while(!pq.isEmpty()) {
			Node now=pq.poll();
			
			if(!union(now.start, now.end)) {
				
				ans=now.weight;
				if(find(s)==find(e)) break;
			}
		}
		if(find(s)!=find(e)) ans=0;
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
		if(find(a)==find(b)) return true;
		parent[b]=a;
		return false;
	}
	
}
