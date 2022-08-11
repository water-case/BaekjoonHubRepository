import java.io.*;
import java.util.*;

public class Main {

	static int[] delx= {-1, 0, 1, 0}; // 상우하좌
	static int[] dely= { 0, 1, 0,-1}; // 상우하좌
	static String[][] map;
	static ArrayList<String> res=new ArrayList<>();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		map=new String[5][5];
		for(int i=0; i<5; i++) {
			st=new StringTokenizer(br.readLine()," ");
			for(int j=0; j<5; j++) {
				map[i][j]=st.nextToken();
			}
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				brute(i,j,0,"");
			}
		}
		
		System.out.println(res.size());
		br.close();
	}
	
	static void brute(int x, int y, int cnt, String num) {
		if(cnt==6) {
			if(res.contains(num)) {
				return;
			} else {
				res.add(num);
				return;
			}
		}
		
		for(int d=0; d<4; d++) {
			int dx=x+delx[d], dy=y+dely[d];
			if(dx<0||dx>=5||dy<0||dy>=5) continue;
			brute(dx,dy,cnt+1,num+map[dx][dy]);
		}
	}
	
}
