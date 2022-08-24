import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		StringTokenizer st;
		
		int n=Integer.parseInt(br.readLine());
		
		int[] arr=new int[n];
		st=new StringTokenizer(br.readLine()," ");
		for(int i=0; i<n; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		int gcd=gcd(arr[0], arr[1]);
		if(n==3) gcd = gcd(gcd, arr[2]);
		
		String other="";
		int i=1;
		for(i=1; i*i<gcd; i++) {
			if(gcd%i == 0) {
				sb.append(i).append("\n");
				other = "\n"+gcd/i+other;
			}
		}
		if(i*i==gcd) sb.append(i).append("\n");
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb.toString()+other);
		br.close();
	}
	
	static int gcd(int a, int b) {
		b=b%a;
		if(b==0) return a;
		else return gcd(b,a);
	}
	
}
