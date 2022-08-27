import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		char[] N=br.readLine().toCharArray();
		
		char[] res=new char[7];
		for(int i=N.length-1; i>=0; i--) {
			if(N[i]<'4') {
				if(i>0) {
					N[i-1]-=1;
					res[i]='7';
					Arrays.fill(res, i+1, N.length, '7');
				} else {
					Arrays.fill(res, i+1, N.length, '7');
				}
				continue;
			} else if(N[i]<'7') {
				res[i]='4';
				if(N[i]!='4')
					Arrays.fill(res, i+1, N.length, '7');
			} else {
				res[i]='7';
				if(N[i]!='7')
					Arrays.fill(res, i+1, N.length, '7');
			}
		}
		
		int result=0;
		for(int i=0; i<N.length; i++) {
			if(res[i]!=0) {
				result=(result*10)+res[i]-'0';
			}
		}
		
		System.out.print(result);
		br.close();
	}
	
}
