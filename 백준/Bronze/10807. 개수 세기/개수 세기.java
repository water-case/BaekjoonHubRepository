import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N=Integer.parseInt(br.readLine());
		st=new StringTokenizer(br.readLine()," ");
		
		int[] nums=new int[201];
		while(N-->0) {
			int v=Integer.parseInt(st.nextToken())+100;
			nums[v]++;
		}
		
		int idx=Integer.parseInt(br.readLine())+100;
		System.out.println(nums[idx]);
		br.close();
	}
	
}
