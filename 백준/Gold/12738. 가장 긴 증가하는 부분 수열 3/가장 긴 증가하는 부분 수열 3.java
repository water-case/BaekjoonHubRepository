import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N=Integer.parseInt(br.readLine());
		int[] nums=new int[N];
		st=new StringTokenizer(br.readLine()," ");
		for(int i=0; i<N; i++) {
			nums[i]=Integer.parseInt(st.nextToken());
		}
		
		int[] lis=new int[N];
		Arrays.fill(lis, Integer.MAX_VALUE);
		for(int i=0; i<N; i++) {
			int b=Arrays.binarySearch(lis, nums[i]);
			if(b<0) {
				lis[-b-1]=nums[i];
			}
		}
		
		int cnt=0;
		for(int i=0; i<N; i++) {
			if(lis[i]==Integer.MAX_VALUE) break;
			cnt++;
		}
		System.out.println(cnt);
		br.close();
	}
	
}
