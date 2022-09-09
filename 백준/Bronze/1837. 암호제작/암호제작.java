import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	static final int PRIME_SIZE=1_000_000;
	
	static BigInteger P;
	static int K;
	static boolean[] prime=new boolean[PRIME_SIZE+1];
	static ArrayList<Integer> plist=new ArrayList<>();
	static String res="GOOD";
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine(), " ");
		
		P=new BigInteger(st.nextToken());
		K=Integer.parseInt(st.nextToken());
		
		MakePrime();
		BruteForce();
		
		System.out.println(res);
		br.close();
	}

	private static void BruteForce() {
		for(int i:plist) {
			if(i>=K) return;
			if(P.remainder(BigInteger.valueOf(i)).compareTo(BigInteger.ZERO) == 0) {
				res="BAD "+i;
				return;
			}
		}
	}

	private static void MakePrime() {
		Arrays.fill(prime, true);
		prime[0]=false;
		prime[1]=false;
		int idx=1;
		while(idx<PRIME_SIZE) {
			idx++;
			
			if(prime[idx]==false) continue;
			
			int next=idx*2;
			while(next<=PRIME_SIZE) {
				prime[next]=false;
				next+=idx;
			}
		}
		
		idx=2;
		while(idx<PRIME_SIZE) {
			if(prime[idx]==true) plist.add(idx);
			idx++;
		}
	}
	
}
