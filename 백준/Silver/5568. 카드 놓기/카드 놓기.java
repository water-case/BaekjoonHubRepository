import java.io.*;
import java.util.*;

public class Main {
	
	static int n,k;
	static long[] nums;
	static ArrayList<Long> list=new ArrayList<>();

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		n=Integer.parseInt(br.readLine());
		k=Integer.parseInt(br.readLine());
		
		nums=new long[n];
		
		for(int i=0; i<n; i++) {
			nums[i]=Integer.parseInt(br.readLine());
		}
		
		comb(0,0, new boolean[n]);
		
		System.out.println(list.size());
		br.close();
	}

	static void comb(int cnt, long num, boolean[] v) {
		if(cnt==k) {
			if(!list.contains(num)) {
				list.add(num);
			}
			return;
		}
		
		for(int i=0; i<n; i++) {
			if(v[i]) continue;
			
			v[i]=true;
			long next=nums[i]>=10?num*100+nums[i]:num*10+nums[i];
			comb(cnt+1, next, v);
			v[i]=false;
		}
	}
	
}
