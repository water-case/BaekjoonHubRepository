import java.io.*;
import java.util.*;

public class Main {

	static char[] origin, search;
	static int res=0, findNum=0;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		origin=br.readLine().toCharArray();
		search=br.readLine().toCharArray();
		
		for(int i=0; i<=origin.length-search.length; i++) {
			if(i<findNum) continue;
			searching(i);
		}
		System.out.println(res);
		br.close();
	}

	static void searching(int on) {
		for(int i=0; i<search.length; i++) {
			if(origin[on+i]!=search[i]) return;
		}
		findNum=on+search.length;
		res++;
	}
	
}
