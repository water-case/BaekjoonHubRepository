import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String s=br.readLine();
		
		int res=s.length()*2-1;
		
		label:for(int i=0; i<s.length(); i++) {
			char[] s2=s.substring(i, s.length()).toCharArray();
			
			int cnt=s2.length/2;
			for(int j=0; j<cnt; j++) {
				if(s2[j]!=s2[s2.length-j-1]) {
					continue label;
				}
			}
			
			res=s.length()+i;
			break;
		}

		System.out.println(res);
		br.close();
	}
	
}
