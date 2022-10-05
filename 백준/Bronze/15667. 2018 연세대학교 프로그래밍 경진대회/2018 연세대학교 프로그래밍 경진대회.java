import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		int K=1;
		int cnt=0;
		while(true) {
			cnt+=1;
			cnt+=K;
			cnt+=K*K;
			
			if(cnt==N) break;
			K++;
			cnt=0;
		}
		
		System.out.println(K);
		br.close();
	}
	
}
