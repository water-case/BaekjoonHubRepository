import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int N=Integer.parseInt(br.readLine());
		
		double[] nums=new double[N];
		for(int i=0; i<N; i++) {
			nums[i]=Double.parseDouble(br.readLine());
		}
		
		double[] memo=new double[N];
		memo[0]=nums[0];
		double res=memo[0];
		for(int i=1; i<N; i++) {
			memo[i]=Math.max(nums[i], memo[i-1]*nums[i]);
			if(memo[i]>res) {
				res=memo[i];
			}
		}
		System.out.println(String.format("%.3f", res));
		br.close();
	}
	
}
