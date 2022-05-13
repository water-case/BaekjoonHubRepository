import java.io.*;
import java.util.*;

public class Main {

	static int[] delx= {-1, 0, 1, 0}; // 상우하좌
	static int[] dely= { 0, 1, 0,-1};
	static int H, W;
	static char[][] map;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		H=Integer.parseInt(st.nextToken());
		W=Integer.parseInt(st.nextToken());
		map=new char[H][W];
		for(int i=0; i<H; i++) map[i]=br.readLine().toCharArray();
		
		int ans=0;
		for(int i=0; i<H; i++)
			for(int j=0; j<W; j++)
				if(map[i][j]=='L') ans=Math.max(ans, bfs(i,j));

		System.out.println(ans);
		br.close();
	}
	
	static int bfs(int x, int y) {
		int ans=0;
		
		boolean[][] v=new boolean[H][W];
		ArrayDeque<int[]> q=new ArrayDeque<>();
		v[x][y]=true;
		q.offer(new int[] {x,y,0});
		while(!q.isEmpty()) {
			int[] now=q.poll();
			
			ans=Math.max(ans, now[2]);
			for(int d=0; d<4; d++) {
				int dx=now[0]+delx[d], dy=now[1]+dely[d];
				if(dx<0||dx>=H||dy<0||dy>=W||map[dx][dy]=='W'||v[dx][dy]) continue;
				v[dx][dy]=true;
				q.offer(new int[] {dx,dy,now[2]+1});
			}
		}
		
		return ans;
	}
	
}
