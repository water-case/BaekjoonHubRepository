import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		
		int N=n;
		int res=N/5;
		N%=5;
		if(N%2==0) {
			res+=N/2;
			N=0;
		} else {
			if(n>5) N+=5;
			if(N%2==0) {
				res+=N/2-1;
			} else {
				res=-1;
			}
		}
		
		System.out.println(res);
		br.close();
	}
	
}
