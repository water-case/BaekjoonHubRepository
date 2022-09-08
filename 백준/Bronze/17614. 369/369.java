import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int N=Integer.parseInt(br.readLine());
		
		int res=0;
		
		for(int i=1; i<=N; i++) {
			int num=i;
			while(num>0) {
				int mod=num%10;
				if(mod==3||mod==6||mod==9) res++;
				num/=10;
			}
		}
		
		System.out.println(res);
		br.close();
	}
	
}
