import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();

		int N=Integer.parseInt(br.readLine());
		String[] word=br.readLine().split("\\*");
		
		for(int i=0; i<N; i++) {
			String str=br.readLine();
			if(word[0].length()+word[1].length() > str.length()) {
				sb.append("NE").append("\n");
				continue;
			}
			
			String start=str.substring(0, word[0].length());
			String end=str.substring(str.length()-word[1].length(), str.length());
			
			if(word[0].equals(start) && word[1].equals(end)) {
				sb.append("DA").append("\n");
			} else {
				sb.append("NE").append("\n");
			}
			
		}
		
		System.out.println(sb.toString());
		br.close();
	}
	
}
