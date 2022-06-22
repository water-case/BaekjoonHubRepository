import java.io.*;
import java.util.*;

public class Main {

	static int[] delx= { 0,-1, 0, 1, 0, 0}; // 상 북 동 남 서 하
	static int[] dely= { 0, 0, 1, 0,-1, 0};
	static int[] delz= {-1, 0, 0, 0, 0, 1};
	static int[][][] map=new int[5][5][5];
	static int[][][] cmap=new int[5][5][5];
	static int ans=Integer.MAX_VALUE;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				st=new StringTokenizer(br.readLine(), " ");
				for(int k=0; k<5; k++)
					map[i][j][k]=Integer.parseInt(st.nextToken());
			}
		}
		
		perm(0, new int[5][5][5], new boolean[5]);
		
		if(ans==Integer.MAX_VALUE) ans=-1;
		System.out.println(ans);
		br.close();
	}
	
	static void perm(int idx, int[][][] tmap, boolean[] chk) {
		if(idx==5) {
			cmap=tmap;
			search();
		}
		
		for(int i=0; i<5; i++) {
			if(!chk[i]) {
				chk[i]=true;
				tmap[idx]=map[i];
				perm(idx+1, tmap, chk);
				chk[i]=false;
			}
		}
	}

	static void search() {
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				for(int k=0; k<4; k++) {
					for(int l=0; l<4; l++) {
						for(int m=0; m<4; m++) {
							ans=Math.min(ans, bfs());
							rotate(4);
						}
						rotate(3);
					}
					rotate(2);
				}
				rotate(1);
			}
			rotate(0);
		}
	}

	static int bfs() {
		int res=Integer.MAX_VALUE;
		if(cmap[0][0][0]==0) return res;
		
		ArrayDeque<int[]> q=new ArrayDeque<>();
		q.offer(new int[] {0,0,0,0});
		boolean[][][] v=new boolean[5][5][5];
		v[0][0][0]=true;
		
		while(!q.isEmpty()) {
			int[] now=q.poll();
			
			if(now[0]==4&&now[1]==4&&now[2]==4) {
				res=now[3];
				break;
			}
			
			for(int d=0; d<6; d++) {
				int dz=now[0]+delz[d], dx=now[1]+delx[d], dy=now[2]+dely[d];
				if(dz<0||dz>=5||dx<0||dx>=5||dy<0||dy>=5||v[dz][dx][dy]||cmap[dz][dx][dy]==0) continue;
				v[dz][dx][dy]=true;
				q.offer(new int[] {dz,dx,dy,now[3]+1});
			}
		}
		
		return res;
	}

	// z층 시계방향 회전
	static void rotate(int z) {
		int[][] temp=new int[5][5];
		
		for(int i=0; i<5; i++)
			for(int j=0; j<5; j++)
				temp[i][j]=cmap[z][4-j][i];
		
		cmap[z]=temp;
	}
	
}
