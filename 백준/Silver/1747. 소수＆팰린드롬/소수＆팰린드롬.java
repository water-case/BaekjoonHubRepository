import java.io.*;
import java.util.*;

public class Main {

	static boolean[] prime;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		prime=new boolean[1_100_001];
		Arrays.fill(prime, true);
		makePrime();
		
		for(int i=N; i<=1_100_000; i++) {
			if(!prime[i]) continue;
			
			String s1=String.valueOf(i);
			StringBuffer sb=new StringBuffer(s1);
			String s2=sb.reverse().toString();
			
			if(s1.equals(s2)) {
				System.out.println(s1);
				break;
			}
		}
		
		br.close();
	}

	static void makePrime() {
		prime[0]=false;
		prime[1]=false;
		for(int i=2; i<=1_000_000; i++) {
			int n=i;
			int cnt=2;
			while(true) {
				int idx=n*cnt++;
				if(idx>1_100_000) break;
				prime[idx]=false;
			}
		}
	}
	
}
