import java.io.*;
import java.util.*;

public class Main {

	static int N;
	static int[][] wa,memo;
	static final int MAX=16_000_000;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N=Integer.parseInt(br.readLine());
		wa=new int[N][N];
		for(int i=0; i<N; i++) {
			st=new StringTokenizer(br.readLine()," ");
			for(int j=0; j<N; j++) 
				wa[i][j]=Integer.parseInt(st.nextToken());
		}
		memo=new int[N][(1<<N)-1];
		
		System.out.println(dp(0,1));

		br.close();
	}

	static int dp(int cnt, int bit) {
		if(bit==(1<<N)-1){
			if(wa[cnt][0]==0) return MAX;
			return wa[cnt][0];
		}
		
		if(memo[cnt][bit]>0) return memo[cnt][bit];
		
		memo[cnt][bit]=MAX;
		for(int i=0; i<N; i++) {
			if(i!=cnt && (bit&(1<<i))==0 && wa[cnt][i]>0) {
				memo[cnt][bit]=Math.min(memo[cnt][bit],  wa[cnt][i]+dp(i,bit|(1<<i)));
			}
		}
		
		return memo[cnt][bit];
	}
	
}
