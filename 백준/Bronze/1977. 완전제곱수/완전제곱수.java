import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int M=Integer.parseInt(br.readLine());
		int N=Integer.parseInt(br.readLine());
		
		int sum=0;
		int min=Integer.MAX_VALUE;
		
		for(int i=(int) Math.ceil(Math.sqrt(M)); i<=Math.floor(Math.sqrt(N)); i++) {
			sum+=i*i;
			min=Math.min(min, i*i);
		}
		
		if(min!=Integer.MAX_VALUE) {
			System.out.println(sum);
			System.out.println(min);
		} else {
			System.out.println(-1);
		}
		br.close();
	}
	
}
