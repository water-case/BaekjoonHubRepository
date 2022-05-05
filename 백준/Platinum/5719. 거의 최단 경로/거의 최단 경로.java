import java.io.*;
import java.util.*;

public class Main {

	static class Node {
		int end, price;

		public Node(int end, int price) {
			this.end = end;
			this.price = price;
		}
		
	}
	
	static int N,M,S,D;
	static int[] dist;
	static ArrayList<Node>[] g;
	static ArrayList<Integer>[] route;
	static boolean[][] routev;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		while(true) {
			st=new StringTokenizer(br.readLine()," ");
			N=Integer.parseInt(st.nextToken());
			M=Integer.parseInt(st.nextToken());
			if(N==0 && M==0) break;
			
			dist=new int[N];
			g=new ArrayList[N];
			route=new ArrayList[N];
			routev=new boolean[N][N];
			
			for(int i=0; i<N; i++) {
				route[i]=new ArrayList<>();
				g[i]=new ArrayList<>();
			}
			
			st=new StringTokenizer(br.readLine()," ");
			S=Integer.parseInt(st.nextToken());
			D=Integer.parseInt(st.nextToken());
			
			
			for(int i=0; i<M; i++) {
				st=new StringTokenizer(br.readLine()," ");
				int a=Integer.parseInt(st.nextToken());
				int b=Integer.parseInt(st.nextToken());
				int c=Integer.parseInt(st.nextToken());
				g[a].add(new Node(b, c));
			}
			
			// 최단거리 구하기(경로도함께)
			dijkstra();
			// 최단거리 경로 방문처리
			dfs(D);
			// 최단거리 경로제외한 간선으로 다시 최단거리 구하기
			dijkstra();
			
			if(dist[D]==Integer.MAX_VALUE) System.out.println(-1);
			else System.out.println(dist[D]);
		}
		br.close();
	}
	
	static void dfs(int node) {
		if(node==S) return;
		for(int next:route[node]) {
			if(!routev[next][node]) {
				routev[next][node]=true;
				dfs(next);
			}
		}
	}

	static void dijkstra() {
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[S]=0;
		boolean[] v=new boolean[N];
		for(int c=0; c<N; c++) {
			int min=Integer.MAX_VALUE;
			int minv=0;
			
			for(int i=0; i<N; i++) {
				if(!v[i] && min>dist[i]) {
					min=dist[i];
					minv=i;
				}
			}
			
			v[minv]=true;
			
			for(Node next:g[minv]) {
				if(!routev[minv][next.end]) {
					if(!v[next.end] && dist[next.end]==dist[minv]+next.price) {
						dist[next.end]=dist[minv]+next.price;
						route[next.end].add(minv);
					} else if (!v[next.end] && dist[next.end]>dist[minv]+next.price) {
						dist[next.end]=dist[minv]+next.price;
						route[next.end].clear();
						route[next.end].add(minv);
					}
				}
			}
		}
	}
}
