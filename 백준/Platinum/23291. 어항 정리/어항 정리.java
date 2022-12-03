import java.io.*;
import java.util.*;

public class Main {

	static int[] delx={0, 1}; // 우하
	static int[] dely={1, 0}; // 우하
	static int N,K;
	static int[][] map;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		N=Integer.parseInt(st.nextToken());
		K=Integer.parseInt(st.nextToken());
		
		map=new int[N][N];
		
		st=new StringTokenizer(br.readLine()," ");
		for(int i=0; i<N; i++) map[0][i]=Integer.parseInt(st.nextToken());
		
		int res=0;
		while(Checking()) {
			AddFish();
			RotateStack();
			DivideFish();
			MakeLine();
			CenterStack();
			DivideFish();
			MakeLine();
			res++;
		}
		
		System.out.println(res);
		br.close();
	}

	private static boolean Checking() {
		int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
		for(int i=0; i<N; i++) {
			min=Math.min(min, map[0][i]);
			max=Math.max(max, map[0][i]);
		}
		if(max-min>K) return true;
		return false;
	}

	private static void AddFish() {
		int min=Integer.MAX_VALUE;
		for(int i=0; i<N; i++) 
			min=Math.min(min, map[0][i]);
		
		for(int i=0; i<N; i++) 
			if(map[0][i]==min) 
				map[0][i]++;
	}
	
	private static void RotateStack() {
		int y=1, v=1, h=1;
		
		while(y+h-1<N) {
			for(int i=0; i<h; i++) {
				for(int j=y-v; j<y; j++) {
					map[y-j][y+i]=map[i][j];
					map[i][j]=0;
				}
			}
			y+=h;
			if(v==h) h++;
			else v++;
		}
	}
	
	private static void DivideFish() {
		int[][] tmap=new int[N][N];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(map[i][j]==0) continue;
				
				for(int d=0; d<2; d++) {
					int dx=i+delx[d], dy=j+dely[d];
					if(dx<0||dx>=N||dy<0||dy>=N||map[dx][dy]==0) continue;
					
					int cal=Math.abs(map[i][j]-map[dx][dy])/5;
					if(map[i][j]>map[dx][dy]) {
						tmap[i][j]-=cal;
						tmap[dx][dy]+=cal;
					} else {
						tmap[dx][dy]-=cal;
						tmap[i][j]+=cal;
					}
				}
			}
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				map[i][j]+=tmap[i][j];
			}
		}
	}

	private static void MakeLine() {
		int[] tmap=new int[N];
		int idx=0;
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(map[j][i]==0) continue;
				tmap[idx++]=map[j][i];
				map[j][i]=0;
			}
		}
		
		for(int i=0; i<N; i++) map[0][i]=tmap[i];
	}
	
	private static void CenterStack() {
		for(int i=0; i<N/2; i++) {
			map[1][N-i-1]=map[0][i];
			map[0][i]=0;
		}
		
		for(int i=N/2; i<N*3/4; i++) {
			map[2][N*3/2-i-1]=map[1][i];
			map[1][i]=0;
			map[3][N*3/2-i-1]=map[0][i];
			map[0][i]=0;
		}
	}
	
}
