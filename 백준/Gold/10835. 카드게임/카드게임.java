import java.io.*;
import java.util.*;

public class Main {

	static Integer[][] memo;
	static int N;
	static int[] left, right;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1, st2;
		
		N=Integer.parseInt(br.readLine());
		
		left=new int[N];
		right=new int[N];
		st1=new StringTokenizer(br.readLine()," ");
		st2=new StringTokenizer(br.readLine()," ");
		for(int i=0; i<N; i++) {
			left[i]=Integer.parseInt(st1.nextToken());
			right[i]=Integer.parseInt(st2.nextToken());
		}
		
		memo=new Integer[N+1][N+1]; // 왼쪽N개, 오른쪽N개 버렸을때 최대값
		
		System.out.println(dp(0,0));
		br.close();
	}
	
	static int dp(int l, int r) {
		if(l >= N || r >= N) memo[l][r]=0;
		
		if(memo[l][r] == null) {
			memo[l][r]=0;
			if(left[l] > right[r]) memo[l][r]=Math.max(memo[l][r], dp(l, r+1)+right[r]);
			memo[l][r]=Math.max(memo[l][r],  dp(l+1, r));
			memo[l][r]=Math.max(memo[l][r],  dp(l+1, r+1));
		}
		
		return memo[l][r];
	}
	
}
