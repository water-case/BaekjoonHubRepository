import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		StringTokenizer st;
		
		while(true) {
			st=new StringTokenizer(br.readLine(), " ");
			char alpha=st.nextToken().charAt(0);
			if(alpha=='#') break;
			
			String other="";
			while(st.hasMoreTokens()) {
				other+=st.nextToken();
			}
			char[] ca=other.toCharArray();
			
			int cnt=0;
			for(int i=0; i<ca.length; i++) {
				if(ca[i]==alpha || ca[i]==alpha-32) cnt++;
			}
			sb.append(alpha).append(" ").append(cnt).append("\n");
		}

		System.out.println(sb.toString());
		br.close();
	}
	
}
