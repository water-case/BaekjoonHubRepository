import java.io.*;
import java.util.*;

public class Main {

	static int[][] map=new int[5][5];
	static boolean[] v=new boolean[25];
	static int ans=0;
	static int[] delx= {-1, 0, 1, 0};
	static int[] dely= { 0, 1, 0,-1};
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0; i<5; i++) {
			String[] s=br.readLine().split("");
			for(int j=0; j<5; j++) {
				if(s[j].equals("Y")) map[i][j]=0;
				else map[i][j]=1;
			}
		}
		
		comb(0,0);
		System.out.println(ans);
		br.close();
	}
	
	static void comb(int start, int cnt) {
		if(cnt==7) {
			int n=0, total=0, x=0, y=0;
			int[][] cmap=new int[5][5];
			for(int i=0; i<25; i++) {
				int r=i/5, c=i%5;
				if(v[i]) {
					cmap[r][c]=1;
					if(total==0) {
						x=r; y=c;
					}
					if(map[r][c]==1) n++;
					total++;
				}
				if(total==7) break;
			}
			if(n>=4) {
				bfs(x,y,cmap);
			}
			return;
		}
		for(int i=start; i<25; i++) {
			if(!v[i]) {
				v[i]=true;
				comb(i+1, cnt+1);
				v[i]=false;
			}
		}
	}
	
	static void bfs(int x, int y, int[][] cmap) {
		ArrayDeque<int[]> q=new ArrayDeque<>();
		boolean[][] visit=new boolean[5][5];
		q.offer(new int[] {x,y});
		visit[x][y]=true;
		int num=1;
		
		while(!q.isEmpty()) {
			int[] now=q.poll();
			for(int d=0; d<4; d++) {
				int dx=now[0]+delx[d], dy=now[1]+dely[d];
				if(dx<0||dx>=5||dy<0||dy>=5||visit[dx][dy]) continue;
				if(cmap[dx][dy]!=1) continue;
				q.offer(new int[] {dx, dy});
				visit[dx][dy]=true;
				num++;
			}
		}
		if(num==7) ans++;
	}
	
}
