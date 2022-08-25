import java.io.*;
import java.util.*;

public class Main {
	
	static int N;
	static double[] percent;
	static boolean[][] v=new boolean[29][29];
	static int[] delx= { 0, 0,-1, 1}; // 우좌상하
	static int[] dely= { 1,-1, 0, 0}; // 우좌상하

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		N=Integer.parseInt(st.nextToken());
		percent=new double[4];
		for(int i=0; i<4; i++) {
			percent[i]=Integer.parseInt(st.nextToken())/100.0;
		}
		
		System.out.println(dfs(14, 14, 0));

		br.close();
	}

	static double dfs(int x, int y, int cnt) {
		if(cnt == N) return 1.0;
		
		v[x][y]=true;
		double res=0.0;
		
		for(int i=0; i<4; i++) {
			int dx=x+delx[i], dy=y+dely[i];
			
			if(v[dx][dy]) continue;
			res+=percent[i] * dfs(dx,dy,cnt+1);
		}
		v[x][y]=false;
		
		return res;
	}
	
}
