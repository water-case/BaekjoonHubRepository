import java.io.*;
import java.util.*;

public class Main {

	static int[] delx= {-1, 0, 1, 0}; // 상우하좌
	static int[] dely= { 0, 1, 0,-1}; // 상우하좌
	static int M,N,d=1,res=0,x=0,y=0;
	static boolean[][] map;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		M=Integer.parseInt(st.nextToken());
		N=Integer.parseInt(st.nextToken());
		map=new boolean[M][N];
		
		do {
			map[x][y]=true;
		} while(move());

		System.out.println(res);
		br.close();
	}

	private static boolean check() {
		for(int d=0; d<4; d++) {
			int dx=x+delx[d], dy=y+dely[d];
			if(dx<0||dx>=M||dy<0||dy>=N||map[dx][dy]) continue;
			return true;
		}
		return false;
	}

	private static boolean move() {
		int dx=x+delx[d], dy=y+dely[d];
		if(dx<0||dx>=M||dy<0||dy>=N||map[dx][dy]) {
			if(!check()) return false;
			d=(d+1)%4;
			res++;
			dx=x+delx[d];
			dy=y+dely[d];
		}
		x=dx; y=dy;
		return true;
	}
	
}
