import java.io.*;
import java.util.*;

public class Main {

	static int[] delx={-1, 0, 1, 0};
	static int[] dely={ 0, 1, 0,-1};
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		StringTokenizer st;
		
		int T=Integer.parseInt(br.readLine());
		for(int tc=1; tc<=T; tc++) {
			st=new StringTokenizer(br.readLine()," ");
			int H=Integer.parseInt(st.nextToken());
			int W=Integer.parseInt(st.nextToken());
			char[][] map=new char[H][W];
			
			for(int i=0; i<H; i++) map[i]=br.readLine().toCharArray();
			int cnt=0;
			
			ArrayDeque<int[]> q=new ArrayDeque<>();
			for(int i=0; i<H; i++) {
				for(int j=0; j<W; j++) {
					if(map[i][j]=='#') {
						cnt++;
						map[i][j]='.';
						q.offer(new int[] {i, j});
						while(!q.isEmpty()) {
							int[] now=q.poll();
							
							for(int d=0; d<4; d++) {
								int dx=now[0]+delx[d], dy=now[1]+dely[d];
								if(dx<0||dx>=H||dy<0||dy>=W||map[dx][dy]=='.') continue;
								map[dx][dy]='.';
								q.offer(new int[] {dx,dy});
							}
						}
					}
				}
			}
			
			sb.append(cnt).append("\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
	
}
