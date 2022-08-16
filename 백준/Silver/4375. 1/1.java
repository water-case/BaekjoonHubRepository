import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			int res=1;
			int num=1;
			String l=br.readLine();
			if(l==null || l.equals("#")) break;
			int n=Integer.parseInt(l);
			
			while(true) {
				if(num%n==0) {
					System.out.println(res);
					break;
				}
				res++;
				num%=n;
				num=(num*10)+1;
			}
		}
		
		br.close();
	}
	
}
