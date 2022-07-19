import java.io.*;
import java.util.*;

public class Main {

	static class Node implements Comparable<Node> {
		int end, price, max;

		public Node(int end, int price) {
			super();
			this.end = end;
			this.price = price;
			max=0;
		}
		
		public Node(int end, int price, int max) {
			super();
			this.end = end;
			this.price = price;
			this.max = max;
		}

		@Override
		public int compareTo(Node o) {
			return Integer.compare(price, o.price);
		}
	}
	
	static int N,M,A,B,C;
	static ArrayList<Node>[] g;
	static boolean[] v;
	static int res;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		A=Integer.parseInt(st.nextToken());
		B=Integer.parseInt(st.nextToken());
		C=Integer.parseInt(st.nextToken());
		
		g=new ArrayList[N+1];
		for(int i=1; i<=N; i++) g[i]=new ArrayList<>();
		
		for(int i=0; i<M; i++) {
			st=new StringTokenizer(br.readLine()," ");
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			int c=Integer.parseInt(st.nextToken());
			g[a].add(new Node(b, c));
			g[b].add(new Node(a, c));
		}
		
		v=new boolean[N+1];
		res=Integer.MAX_VALUE;
		dfs(A,C,-1);
		
		System.out.println(res==Integer.MAX_VALUE?-1:res);
		br.close();
	}

	private static void dfs(int now, int money, int max) {
		if(now==B) {
			res=Math.min(res, max);
			return;
		}
		
		if(money<=0) return;
		
		for(Node next:g[now]) {
			if(!v[next.end] && next.price<=money) {
				v[next.end]=true;
				dfs(next.end, money-next.price, Math.max(next.price, max));
				v[next.end]=false;
			}
		}
	}
	
}
