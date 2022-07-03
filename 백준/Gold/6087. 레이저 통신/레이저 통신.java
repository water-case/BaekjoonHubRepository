import java.io.*;
import java.util.*;

public class Main {

	static class Node implements Comparable<Node> {
		int x, y, d, cnt;

		public Node(int x, int y, int d, int cnt) {
			super();
			this.x = x;
			this.y = y;
			this.d = d;
			this.cnt = cnt;
		}
		
		@Override
		public int compareTo(Node o) {
			return Integer.compare(cnt, o.cnt);
		}
	}
	
	static int[] delx={-1, 0, 1, 0}; // 상우하좌
	static int[] dely={ 0, 1, 0,-1}; // 상우하좌
	static Node start, end;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int W=Integer.parseInt(st.nextToken());
		int H=Integer.parseInt(st.nextToken());
		char[][] g=new char[H][W];
		int[][] dist=new int[H][W];
		
		for(int i=0; i<H; i++) {
			g[i]=br.readLine().toCharArray();
			for(int j=0; j<W; j++) {
				dist[i][j]=Integer.MAX_VALUE;
				if(g[i][j]=='C') {
					if(start==null) start=new Node(i, j, -1, 0);
					else              end=new Node(i, j, -1, 0);
				}
			}
		}
		
		PriorityQueue<Node> pq=new PriorityQueue<>();
		pq.offer(start);
		dist[start.x][start.y]=0;
		
		while(!pq.isEmpty()) {
			Node now=pq.poll();
			
			if(now.x==end.x && now.y==end.y) break;
			
			for(int d=0; d<4; d++) {
				int dx=now.x+delx[d], dy=now.y+dely[d], dcnt=now.cnt;
				if(dx<0||dx>=H||dy<0||dy>=W||g[dx][dy]=='*') continue;
				
				if(now.d!=-1 && now.d!=d) dcnt++;
				
				if(dist[dx][dy]>=dcnt) {
				   dist[dx][dy] =dcnt;
				   pq.offer(new Node(dx, dy, d, dcnt));
				}
			}
		}
		
		System.out.println(dist[end.x][end.y]);
		br.close();
	}
	
}
