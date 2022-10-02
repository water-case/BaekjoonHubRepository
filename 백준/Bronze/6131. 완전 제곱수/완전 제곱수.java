import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int N=Integer.parseInt(br.readLine());
		
		int res=0;
		label:for(int i=1; i<=500; i++) {
			int A=i*i;
			for(int j=i-1; j>0; j--) {
				int B=j*j;
				if(A==B+N) res++;
				else if(A-B>N) {
					if(j==i-1) break label;
					break;
				}
			}
		}
		
		System.out.println(res);
		br.close();
	}
	
}
