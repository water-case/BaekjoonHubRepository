import java.io.*;
import java.util.*;

public class Main {

	static int[] delx={-1, 0, 1, 0}; // 상우하좌
	static int[] dely={ 0, 1, 0,-1}; // 상우하좌
	static int res=0;
	static char[][] map=new char[12][6];
	static boolean[][] v;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0; i<12; i++) map[i]=br.readLine().toCharArray();
		
		while(Puyo()) {
			res++;
			Down();
		}
		
		System.out.println(res);
		br.close();
	}

	private static boolean Puyo() {
		boolean chk=false;
		v=new boolean[12][6];
		for(int i=11; i>=0; i--) {
			for(int j=0; j<6; j++) {
				if(map[i][j]=='.'||v[i][j]) continue;
				
				v[i][j]=true;
				if(search(i,j)>=4) {
					bomb(i,j,map[i][j]);
					chk=true;
				}
			}
		}
		return chk;
	}

	private static int search(int x, int y) {
		int tcnt=1;
		for(int d=0; d<4; d++) {
			int dx=x+delx[d], dy=y+dely[d];
			if(dx<0||dx>=12||dy<0||dy>=6||v[dx][dy]||map[dx][dy]!=map[x][y]) continue;
			v[dx][dy]=true;
			tcnt+=search(dx,dy);
		}
		return tcnt;
	}

	private static void bomb(int x, int y, char alpha) {
		map[x][y]='.';
		for(int d=0; d<4; d++) {
			int dx=x+delx[d], dy=y+dely[d];
			if(dx<0||dx>=12||dy<0||dy>=6||map[dx][dy]!=alpha) continue;
			bomb(dx,dy,alpha);
		}
	}
	
	private static void Down() {
		for(int i=0; i<6; i++) {
			for(int j=11; j>=0; j--) {
				if(map[j][i]!='.') continue;
				
				for(int k=j-1; k>=0; k--) {
					if(map[k][i]!='.') {
						map[j][i]=map[k][i];
						map[k][i]='.';
						break;
					}
				}
			}
		}
	}
	
}
