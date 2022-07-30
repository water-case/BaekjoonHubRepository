import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		char[] c1=st.nextToken().toCharArray();
		char[] c2=st.nextToken().toCharArray();
		
		int res=50;
		
		for(int i=0; i<=c2.length-c1.length; i++) {
			int cnt=0;
			for(int j=0; j<c1.length; j++) {
				if(c1[j]!=c2[j+i]) cnt++;
			}
			res=Math.min(res, cnt);
		}
		
		System.out.println(res);
		br.close();
	}
	
}
