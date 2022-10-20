import java.io.*;
import java.util.*;

public class Main {

	static int R,C,K,res;
	static char[][] map;
	static boolean[][] v;
	static int[] delx={-1, 0, 1, 0};
	static int[] dely={ 0, 1, 0,-1};
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		R=Integer.parseInt(st.nextToken());
		C=Integer.parseInt(st.nextToken());
		K=Integer.parseInt(st.nextToken());
		
		v=new boolean[R][C];
		map=new char[R][];
		for(int i=0; i<R; i++) {
			map[i]=br.readLine().toCharArray();
		}
		
		v[R-1][0]=true;
		brute(R-1, 0, 1);

		System.out.println(res);
		br.close();
	}

	private static void brute(int x, int y, int cnt) {
		if(cnt>K) return;
		if(cnt==K && x==0 && y==C-1) {
			res++;
			return;
		}
		
		for(int d=0; d<4; d++) {
			int dx=x+delx[d], dy=y+dely[d];
			
			if(dx<0||dx>=R||dy<0||dy>=C||map[dx][dy]=='T'||v[dx][dy]) continue;
			
			v[dx][dy]=true;
			brute(dx,dy,cnt+1);
			v[dx][dy]=false;
		}
	}
	
}
