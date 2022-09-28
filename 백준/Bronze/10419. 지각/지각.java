import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		int T=Integer.parseInt(br.readLine());
		for(int tc=0; tc<T; tc++) {
			int d=Integer.parseInt(br.readLine());
			
			int res=0;
			for(int i=0; i<=Math.sqrt(d); i++) {
				if(i+i*i<=d) res=i;
			}
			sb.append(res).append("\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
	
}
