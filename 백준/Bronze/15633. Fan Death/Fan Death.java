import java.io.*;
import java.util.*;

public class Main{

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int res=0;
		int N=Integer.parseInt(br.readLine());
		for(int i=1; i<=N; i++) {
			if(N%i==0) res+=i;
		}
		
		System.out.println((res*5)-24);
		br.close();
	}
	
}
