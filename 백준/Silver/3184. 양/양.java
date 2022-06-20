import java.io.*;
import java.util.*;

public class Main {

	static int[] delx = {-1, 0, 1, 0};
	static int[] dely = { 0, 1, 0,-1};
	static int R,C,sheep,wolf;
	static char[][] map;
	static boolean[][] v;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");

		R=Integer.parseInt(st.nextToken());
		C=Integer.parseInt(st.nextToken());
		map=new char[R][C];
		for(int i=0; i<R; i++) map[i]=br.readLine().toCharArray();
		
		int sheep=0;
		int wolf=0;
		v=new boolean[R][C];
		for(int i=0; i<R; i++) {
			for(int j=0; j<C; j++) {
				int[] res=null;
				if(map[i][j]!='#') {
					res=dfs(i,j,new int[] {0,0});
//					System.out.println(i+" "+j+" "+Arrays.toString(res));
					if(res[0] > res[1]) sheep+=res[0];
					else 			     wolf+=res[1];
				}
			}
		}
		System.out.println(sheep + " " + wolf);
		br.close();
	}

	static int[] dfs(int i, int j, int[] sw) {
		if(v[i][j]) return new int[] {0,0};
		v[i][j]=true;
		     if(map[i][j]=='o') sw[0]++;
		else if(map[i][j]=='v') sw[1]++;
		map[i][j]='.';
		for(int d=0; d<4; d++) {
			int dx=i+delx[d], dy=j+dely[d];
			if(dx<0||dx>=R||dy<0||dy>=C||map[dx][dy]=='#') continue;
			int[] tmp=dfs(dx,dy,new int[] {0,0});
			sw[0]+=tmp[0];
			sw[1]+=tmp[1];
		}
		return sw;
	}
	
}
