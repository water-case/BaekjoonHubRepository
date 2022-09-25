import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		char[] ca=br.readLine().toCharArray();
		
		for(int i=0; i<ca.length; i++) {
			sb.append(ca[i]);
			if(i%10==9) sb.append("\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
	
}
