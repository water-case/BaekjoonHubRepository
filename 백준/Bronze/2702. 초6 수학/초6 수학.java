import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T=Integer.parseInt(br.readLine());
		
		for(int tc=0; tc<T; tc++) {
			st=new StringTokenizer(br.readLine()," ");
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			
			int gcd=gcd(a,b);
			System.out.println(a*b/gcd + " " + gcd);
		}

		br.close();
	}
	
	static int gcd(int n1, int n2) {
		if(n2 == 0) return n1;
		else return gcd(n2, n1%n2);
	}
	
}
