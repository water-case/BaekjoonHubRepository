import java.io.*;
import java.util.*;

public class Main {

	static int N;
	static int[] nums;
	static int[] memo;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T=Integer.parseInt(br.readLine());
		for(int tc=1; tc<=T; tc++) {
			N=Integer.parseInt(br.readLine());
			st=new StringTokenizer(br.readLine()," ");
			nums=new int[N];
			memo=new int[N];
			
			for(int i=0; i<N; i++) {
				nums[i]=Integer.parseInt(st.nextToken());
			}
			
			int res=nums[0];
			memo[0]=nums[0];
			for(int i=1; i<N; i++) {
				if(memo[i-1]<0) memo[i-1]=0;
				memo[i]=memo[i-1]+nums[i];
				res=Math.max(res, memo[i]);
			}
			System.out.println(res);
		}

		br.close();
	}
	
}
