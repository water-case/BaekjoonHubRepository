import java.io.*;
import java.util.*;

public class Main {

	static int[] delx={-1, 0, 1, 0}; // 상우하좌
	static int[] dely={ 0, 1, 0,-1}; //상우하좌
	
	static int N, res=Integer.MAX_VALUE;
	static int[][] map;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N=Integer.parseInt(br.readLine());
		map=new int[N][N];
		
		for(int i=0; i<N; i++) {
			st=new StringTokenizer(br.readLine()," ");
			for(int j=0; j<N; j++) {
				map[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		bruteforce(0,new int[3][2]);

		System.out.println(res);
		br.close();
	}

	private static void bruteforce(int cnt, int[][] pos) {
		if(cnt==3) {
			res=Math.min(res, flower(pos, new boolean[N][N]));
			return;
		}
		
		for(int i=1; i<N-1; i++) {
			for(int j=1; j<N-1; j++) {
				pos[cnt][0]=i;
				pos[cnt][1]=j;
				bruteforce(cnt+1,pos);
			}
		}
	}

	private static int flower(int[][] pos, boolean[][] v) {
		int res=0;
		for(int i=0; i<3; i++) {
			v[pos[i][0]][pos[i][1]]=true;
			res+=map[pos[i][0]][pos[i][1]];
			for(int d=0; d<4; d++) {
				int dx=pos[i][0]+delx[d], dy=pos[i][1]+dely[d];
				if(dx<0||dx>=N||dy<0||dy>=N||v[dx][dy]) {
					res+=20000;
					return res;
				}
				v[dx][dy]=true;
				res+=map[dx][dy];
			}
		}
		return res;
	}
	
}
