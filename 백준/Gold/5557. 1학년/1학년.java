import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N=Integer.parseInt(br.readLine());
		int[] nums=new int[N];
		
		st=new StringTokenizer(br.readLine()," ");
		for(int i=0; i<N; i++) nums[i]=Integer.parseInt(st.nextToken());
		
		long memo[][][] =new long[N-1][2][21]; // N번째 숫자일때 2가지 연산에서 0-20숫자 등장횟수
		int cal=nums[0]+nums[1];
		if(cal>=0 && cal<=20) memo[1][0][cal]++; // 1번째 숫자일때 덧셈연산에서 등장한 숫자 횟수 증가
		cal=nums[0]-nums[1];
		if(cal>=0 && cal<=20) memo[1][1][cal]++; // 1번째 숫자일때 뺄셈연산에서 등장한 숫자 횟수 증가
		
		for(int i=2; i<N-1; i++) {
			for(int j=0; j<21; j++) {
				if(memo[i-1][0][j]!=0) {
					cal=j+nums[i];
					if(cal>=0 && cal<=20) memo[i][0][cal]+=memo[i-1][0][j];
					cal=j-nums[i];
					if(cal>=0 && cal<=20) memo[i][1][cal]+=memo[i-1][0][j];
				}
				if(memo[i-1][1][j]!=0) {
					cal=j+nums[i];
					if(cal>=0 && cal<=20) memo[i][0][cal]+=memo[i-1][1][j];
					cal=j-nums[i];
					if(cal>=0 && cal<=20) memo[i][1][cal]+=memo[i-1][1][j];
				}
			}
		}
		long ans=0;
		for(int j=0; j<2; j++) {
			ans+=memo[N-2][j][nums[N-1]];
		}
		System.out.println(ans);
		br.close();
	}
	
}
