import java.io.*;
import java.util.*;

public class Main {

	static ArrayList<Long> nums=new ArrayList<>();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		if(N<=10) {
			System.out.println(N);
		} else if(N>=1023) {
			System.out.println(-1);
		} else {
			for(int i=0; i<=9; i++) {
				brute(i, 1);
			}
			Collections.sort(nums);
			System.out.println(nums.get(N));
		}

		br.close();
	}

	static void brute(long n, int idx) {
		if(idx>10) return;
		nums.add(n);
		for(int i=0; i<n%10; i++) {
			brute((n*10)+i, idx+1);
		}
	}
	
}
