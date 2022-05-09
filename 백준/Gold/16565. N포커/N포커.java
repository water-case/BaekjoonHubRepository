import java.io.*;
import java.util.*;

public class Main {

	static final int mod=10007;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		int[][] memo=new int[53][53];
		
		for(int n=0; n<=52; n++) { // 파스칼 삼각혐
			memo[n][0]=1; memo[n][n]=1;
			for(int k=1; k<n; k++) {
				memo[n][k]=memo[n-1][k-1]+memo[n-1][k];
				memo[n][k]%=mod;
				memo[n][n-k]=memo[n][k];
			}
		}
		
		int ans=0;
		for(int i=4; i<=N; i+=4) { // 포함배제
			if((i/4)%2==1) ans+=memo[13][i/4]*memo[52-i][N-i];
			else           ans-=memo[13][i/4]*memo[52-i][N-i];
			ans%=mod;
		}
		if(ans<0) ans+=mod;
		System.out.println(ans);
		br.close();
	}
	
}
