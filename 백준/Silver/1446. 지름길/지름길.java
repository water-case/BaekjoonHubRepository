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
			if(start == o.start) Integer.compare(end, o.end);
			return Integer.compare(start, o.start);
		}
		
	}
	
	static ArrayList<Edge> g=new ArrayList<>();
	static int N, D;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		N=Integer.parseInt(st.nextToken());
		D=Integer.parseInt(st.nextToken());
		
		for(int i=0; i<N; i++) {
			st=new StringTokenizer(br.readLine()," ");
			int s=Integer.parseInt(st.nextToken());
			int e=Integer.parseInt(st.nextToken());
			int d=Integer.parseInt(st.nextToken());
			g.add(new Edge(s, e, d));
		}
		
		Collections.sort(g);
		
		System.out.println(dijkstra(0));
		br.close();
	}

	private static int dijkstra(int start) {
		int[] dist=new int[D+1];
		for(int i=0; i<=D; i++) dist[i]=i;
		
		int pos=0;
		int idx=0;
		while(pos < D) {
			while(idx < N) {
				if(g.get(idx).start != pos) {
					 break;
				}
				
				if(g.get(idx).end <= D) {
					if(dist[g.get(idx).end] > dist[pos]+g.get(idx).price) {
						dist[g.get(idx).end] = dist[pos]+g.get(idx).price;
					}
				}
				idx++;
			}
			
			if(dist[pos]+1 < dist[pos+1]) {
				dist[pos+1]=dist[pos]+1;
			}
			pos++;
		}
		
		return dist[D];
	}
	
}
