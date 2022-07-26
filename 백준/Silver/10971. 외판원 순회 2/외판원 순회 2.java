import java.io.*;
import java.util.*;

public class Main {

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
		
		boolean[] v=new boolean[N];
		v[0]=true;
		brute(0,0,0,0,v);
		System.out.println(res);

		br.close();
	}
	
	static void brute(int start, int now, int cnt, int sum, boolean[] v) {
		if(cnt==N-1) {
			if(map[now][0]!=0) {
				sum+=map[now][0];
				res=Math.min(res, sum);
			} else {
				return;
			}
		}
		
		for(int i=0; i<N; i++) {
			if(!v[i] && map[now][i]!=0) {
				v[i]=true;
				brute(start, i, cnt+1, sum+map[now][i], v);
				v[i]=false;
			}
		}
		
	}
	
}
