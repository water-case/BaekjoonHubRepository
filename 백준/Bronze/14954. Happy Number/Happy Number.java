import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		HashSet<Integer> set=new HashSet<>();
		
		int n=Integer.parseInt(br.readLine());
		int res=n;
		do {
			int num=res;
			int sum=0;
			while(num>0) {
				int a=num%10;
				num/=10;
				sum+=(int) Math.pow(a, 2);
			}
			
			if(set.contains(sum)) {
				res=n;
				break;
			}
			set.add(sum);
			
			res=sum;
		} while(res!=1 && res!=n);
		
		System.out.println(res==1?"HAPPY":"UNHAPPY");
		br.close();
	}
	
}
