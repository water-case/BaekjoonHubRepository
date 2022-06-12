import java.io.*;
import java.util.*;

public class Main {

	static int[] delx={-1, 0, 1, 0}; // 상우하좌
	static int[] dely={ 0, 1, 0,-1};
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		char[][] map=new char[N][M];
		
		int x=0;
		int y=0;
		for(int i=0; i<N; i++) {
			map[i]=br.readLine().toCharArray();
			for(int j=0; j<M; j++)
				if(map[i][j]=='I') {
					x=i; y=j;
				}
		}
		
		int ans=0;
		ArrayDeque<int[]> q=new ArrayDeque<>();
		q.offer(new int[] {x,y});
		boolean[][] v=new boolean[N][M];
		v[x][y]=true;
		
		while(!q.isEmpty()) {
			int[] now=q.poll();
			
			if(map[now[0]][now[1]]=='P') ans++;
			
			for(int d=0; d<4; d++) {
				int dx=now[0]+delx[d], dy=now[1]+dely[d];
				if(dx<0||dx>=N||dy<0||dy>=M||v[dx][dy]||map[dx][dy]=='X') continue;
				q.offer(new int[] {dx,dy});
				v[dx][dy]=true;
			}
		}
		
		if(ans==0) System.out.println("TT");
		else System.out.println(ans);
		br.close();
	}
	
}
