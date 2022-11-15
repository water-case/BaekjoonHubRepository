import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		int T=Integer.parseInt(br.readLine());
		for(int tc=1; tc<=T; tc++) {
			int n=Integer.parseInt(br.readLine());
			
			int max=n;
			while(n!=1) {
				if(n%2==0) {
					n/=2;
				} else {
					n=n*3+1;
					max=Math.max(max, n);
				}
			}
			sb.append(max).append("\n");
		}

		System.out.println(sb.toString());
		br.close();
	}
	
}
