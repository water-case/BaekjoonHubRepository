import java.io.*;
import java.util.*;

public class Main {

	static ArrayList<ArrayList<Node>> g;
	static int[] dist;
	static int[] route;
	static int T,N,M;
	static int CASE = 1;
	
	static class Node implements Comparable<Node> {
		int end,price;
		
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
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		T = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=T; tc++) {
			StringTokenizer stk = new StringTokenizer(br.readLine());
			N = Integer.parseInt(stk.nextToken());
			M = Integer.parseInt(stk.nextToken());
			
			
			route = new int[M];
			dist = new int[M];
			g = new ArrayList<ArrayList<Node>>();
			
			clean();
			
			for (int i = 0; i < M; i++) {
				g.add(new ArrayList<>());
			}
			
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int r = Integer.parseInt(st.nextToken());
				int c = Integer.parseInt(st.nextToken());
				int price = Integer.parseInt(st.nextToken());
				
				g.get(r).add(new Node(c,price));
				g.get(c).add(new Node(r,price));
			}
			
			dijkstra();
			
		}
	}
	
	static void dijkstra() {
		
		PriorityQueue<Node> pq = new PriorityQueue<>();
		
		dist[0] = 0;
		pq.offer(new Node(0,0));
		
		while(!pq.isEmpty()) {
			Node nd = pq.poll();
			int cur = nd.end;
			int curW = -nd.price;
			
			if (dist[cur] < curW) continue;
			
			for (int i = 0; i < g.get(cur).size(); i++) {
				int next =  g.get(cur).get(i).end;
				int nextW =  g.get(cur).get(i).price;
				
				if (dist[next] > curW + nextW) {
					dist[next] = curW + nextW;
					pq.offer(new Node(next,-dist[next]));
					route[next] = cur;
				}
			}
		}
		
		
		if (dist[M-1] == 999_999) System.out.printf("Case #%d: -1\n",CASE++);
		else {
			Stack<Integer> stack = new Stack<>();
			
			for (int i = (M-1); i > 0;) {
				stack.push(i = route[i]);
			}

			System.out.printf("Case #%d:",CASE++);
			
			while(!stack.empty()) {
				System.out.printf(" %d",stack.pop());
			}
			
			System.out.printf(" %d\n",M-1);
		}
	}
	
	static void clean() {
		for (int i = 0; i < M; i++) {
			dist[i] = 999_999;
			route[i] = -1;
		}
	}
	
}
