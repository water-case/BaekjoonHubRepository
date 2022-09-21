import java.io.*;
import java.util.*;

public class Main {

	static int[] nums;
	static int tres;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N=Integer.parseInt(br.readLine());
		
		int res=-1, max=-1;
		for(int i=0; i<N; i++) {
			st=new StringTokenizer(br.readLine()," ");
			nums=new int[5];
			for(int j=0; j<5; j++) {
				nums[j]=Integer.parseInt(st.nextToken());
			}
			
			tres=0;
			perm(0,0,0);
			if(tres>=max) {
				max=tres;
				res=i;
			}
		}
		
		System.out.println(res+1);
		br.close();
	}

	private static void perm(int cnt, int idx, int sum) {
		if(cnt==3) {
			tres=Math.max(tres, sum%10);
		}
		
		for(int i=idx; i<5; i++) {
			perm(cnt+1,i+1,sum+nums[i]);
		}
	}
	
	
}
