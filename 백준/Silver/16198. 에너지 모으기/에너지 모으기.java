import java.io.*;
import java.util.*;

public class Main {

	static int res=0;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N=Integer.parseInt(br.readLine());
		
		st=new StringTokenizer(br.readLine()," ");
		LinkedList<Integer> nums=new LinkedList<>();
		for(int i=0; i<N; i++) {
			nums.add(Integer.parseInt(st.nextToken()));
		}
		
		brute(N, nums, 0);
		
		System.out.println(res);
		br.close();
	}
	
	static void brute(int N, LinkedList<Integer> nums, int sum) {
		if(N==2) {
			res=Math.max(res, sum);
			return;
		}
		
		for(int i=1; i<N-1; i++) {
			int cal=nums.get(i-1)*nums.get(i+1);
			int tmp=nums.remove(i);
			brute(N-1, nums, sum+cal);
			nums.add(i, tmp);
		}
	}
	
}
