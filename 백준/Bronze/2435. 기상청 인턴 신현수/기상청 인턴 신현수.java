import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		
		int[] nums=new int[N];
		st=new StringTokenizer(br.readLine()," ");
		for(int i=0; i<N; i++) {
			nums[i]=Integer.parseInt(st.nextToken());
		}
		
		List<Integer> list=new ArrayList<>();
		int n=0;
		for(int i=0; i<K; i++) {
			n+=nums[i];
		}
		list.add(n);
		
		for(int i=1; i<=N-K; i++) {
			n=n-nums[i-1]+nums[i+K-1];
			list.add(n);
		}
		
		int res=Integer.MIN_VALUE;
		for(int i : list) {
			res=Math.max(res, i);
		}
		System.out.println(res);
		br.close();
	}
	
}
