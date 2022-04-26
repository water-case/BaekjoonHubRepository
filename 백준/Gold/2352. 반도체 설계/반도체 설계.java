import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n=Integer.parseInt(br.readLine());
		int[] nums=new int[n];
		
		st=new StringTokenizer(br.readLine()," ");
		for(int i=0; i<n; i++) {
			nums[i]=Integer.parseInt(st.nextToken());
		}
		
		int[] lis=new int[n];
		Arrays.fill(lis, Integer.MAX_VALUE);
		for(int i=0; i<n; i++) {
			if(Arrays.binarySearch(lis, nums[i])<0) {
				lis[-Arrays.binarySearch(lis, nums[i])-1]=nums[i];
			}
		}
		int cnt=0;
		for(int i=0; i<n; i++) {
			if(lis[i]==Integer.MAX_VALUE) break;
			cnt++;
		}
		System.out.println(cnt);
		br.close();
	}
	
}
