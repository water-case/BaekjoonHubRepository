import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		int cnt=0;
		for(int i=1; i<=N; i++) {
			int sum=0, num=i;
			while(num>0) {
				sum+=num%10;
				num/=10;
			}
			if(i%sum==0) cnt++;
		}

		System.out.println(cnt);
		br.close();
	}
	
}
