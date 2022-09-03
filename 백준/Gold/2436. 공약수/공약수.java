import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int GCD=Integer.parseInt(st.nextToken());
		int LCM=Integer.parseInt(st.nextToken());
		
		int LNG=LCM/GCD;
		
		int res1=0, res2=0;
		for(int i=1; i<=Math.sqrt(LNG); i++) {
			if(LNG%i != 0) continue;
			
			int a=i, b=LNG/i;
			if(getGcd(a,b) == 1) {
				res1=a;
				res2=b;
			}
		}
		System.out.println(res1*GCD + " " + res2*GCD);

		br.close();
	}
	
	static int getGcd(int a, int b) {
		if(b==0) return a;
		return getGcd(b, a%b);
	}
	
}
