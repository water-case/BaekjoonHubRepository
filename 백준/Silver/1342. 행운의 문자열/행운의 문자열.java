import java.io.*;
import java.util.*;

public class Main {

	static char[] alpha=new char[26];
	static String S;
	static boolean[] v;
	static int res=0;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		S=br.readLine();
		for(int i=0; i<S.length(); i++) alpha[S.charAt(i)-'a']++;
		
		dfs(0, "");
		
		System.out.println(res);
		br.close();
	}
	
	static void dfs(int cnt, String s) {
		if(cnt==S.length()) {
			res++;
			return;
		}
		
		for(int i=0; i<26; i++) {
			if(alpha[i]==0 || (cnt>0 && s.charAt(cnt-1)==(char)('a'+i)) ) continue;
			
			alpha[i]--;
			dfs(cnt+1, s+(char)('a'+i));
			alpha[i]++;
		}
	}

}
