import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int res=0;
		int diffMin=100;
		for(int i=0; i<10; i++) {
			int n=Integer.parseInt(br.readLine());
			
			int diff=Math.abs(res+n-100);
			if(diffMin>diff) {
				res+=n;
				diffMin=diff;
			} else if(diffMin==diff) {
				res+=n;
				break;
			} else {
				break;
			}
		}
		
		System.out.println(res);
		br.close();
	}
	
}
