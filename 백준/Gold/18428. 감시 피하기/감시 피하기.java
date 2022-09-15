import java.io.*;
import java.util.*;

public class Main {

	static int[] delx={-1, 0, 1, 0}; // 상우하좌
	static int[] dely={ 0, 1, 0,-1}; // 상우하좌
	static int N;
	static char[][] map;
	static boolean res=false;
	static ArrayList<int[]> blank=new ArrayList<>();
	static ArrayList<int[]> teacher=new ArrayList<>();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N=Integer.parseInt(br.readLine());
		map=new char[N][N];
		
		for(int i=0; i<N; i++) {
			st=new StringTokenizer(br.readLine()," ");
			for(int j=0; j<N; j++) {
				map[i][j]=st.nextToken().charAt(0);
			}
		}
		
		BTSearch();
		Bruteforce(0,0,new int[3]);

		if(res) System.out.println("YES");
		else  System.out.println("NO");
		br.close();
	}

	private static void BTSearch() {
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(map[i][j]=='X') blank.add(new int[] {i,j});
				if(map[i][j]=='T') teacher.add(new int[] {i,j});
			}
		}
	}

	private static void Bruteforce(int cnt, int idx, int[] pos) {
		if(res) return;
		if(cnt==3) {
			Searching(pos);
			return;
		}
		
		for(int i=idx; i<blank.size(); i++) {
			pos[cnt]=i;
			Bruteforce(cnt+1, i+1, pos);
		}
		
	}

	private static void Searching(int[] pos) {
		char[][] tmap=new char[N][N];
		for(int i=0; i<N; i++) tmap[i]=map[i].clone();
		
		for(int i=0; i<3; i++) {
			int[] now=blank.get(pos[i]);
			tmap[now[0]][now[1]]='O';
		}
		
		for(int i=0; i<teacher.size(); i++) {
			int[] nteach=teacher.get(i);
			
			for(int d=0; d<4; d++) {
				int dx=nteach[0], dy=nteach[1];
				while(true) {
					dx+=delx[d]; dy+=dely[d];
					if(dx<0||dx>=N||dy<0||dy>=N||tmap[dx][dy]=='O') break;
					if(tmap[dx][dy]=='S') return;
				}
			}
		}
		res=true;
	}
	
}
