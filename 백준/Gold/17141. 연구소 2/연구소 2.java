import java.io.*;
import java.util.*;

public class Main {

	static int[] delx= {-1, 0, 1, 0};
	static int[] dely= { 0, 1, 0,-1};
	static int N,M,ans=Integer.MAX_VALUE;
	static int[][] map;
	static ArrayList<int[]> vPos;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		vPos=new ArrayList<>();
		map=new int[N][N];
		for(int i=0; i<N; i++) {
			st=new StringTokenizer(br.readLine()," ");
			for(int j=0; j<N; j++) {
				map[i][j]=Integer.parseInt(st.nextToken());
				if(map[i][j]==2) {
					vPos.add(new int[] {i,j});
					map[i][j]=0;
				}
			}
		}
		
		comb(0, 0, new int[M]);
		ans=ans==Integer.MAX_VALUE?-1:ans;
		System.out.println(ans);
		br.close();
	}

	static void comb(int cnt, int start, int[] v) {
		if(cnt==M) {
			ans=Math.min(ans, bfs(v));
			return;
		}
		
		for(int i=start; i<vPos.size(); i++) {
			v[cnt]=i;
			comb(cnt+1, i+1, v);
		}
	}

	static int bfs(int[] v) {
		int result=0;
		
		int[][] cmap=new int[N][N];
		for(int i=0; i<N; i++) cmap[i]=map[i].clone();
		
		ArrayDeque<int[]> q=new ArrayDeque<>();
		for(int i=0; i<M; i++) {
			int[] now=vPos.get(v[i]);
			cmap[now[0]][now[1]]=2;
			q.offer(new int[] {now[0], now[1], 0});
		}
		
		while(!q.isEmpty()) {
			int[] now=q.poll();
			
			result=Math.max(result, now[2]);
			
			for(int d=0; d<4; d++) {
				int dx=now[0]+delx[d], dy=now[1]+dely[d];
				if(dx<0||dx>=N||dy<0||dy>=N||cmap[dx][dy]==1||cmap[dx][dy]==2) continue;
				cmap[dx][dy]=2;
				q.offer(new int[] {dx,dy,now[2]+1});
			}
		}
		
		label:
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(cmap[i][j]==0) {
					result=Integer.MAX_VALUE;
					break label;
				}
			}
		}
		
		return result;
	}
	
	
	
}
