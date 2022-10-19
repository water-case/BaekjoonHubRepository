import java.io.*;
import java.util.*;

public class Main {

	static int n,k,cnt=0,ridx=0;
	static int[] res;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		n=Integer.parseInt(st.nextToken());
		k=Integer.parseInt(st.nextToken());
		
		perm(0,0,new int[11]);
		
		StringBuilder sb=new StringBuilder();
		if(ridx==0) sb.append(-1);
		else {
			for(int i=0; i<ridx-1; i++) {
				sb.append(res[i]).append("+");
			}
			sb.append(res[ridx-1]);
		}
		System.out.println(sb.toString());
		br.close();
	}

	private static void perm(int idx, int sum, int[] nums) {
		if(sum>n || cnt>k) return;
		if(sum==n) {
			cnt++;
			if(cnt==k) {
				res=nums.clone();
				ridx=idx;
				cnt++;
				return;
			}
			return;
		}
		
		for(int i=1; i<=3; i++) {
			nums[idx]=i;
			perm(idx+1,sum+i,nums);
		}
	}
	
}
