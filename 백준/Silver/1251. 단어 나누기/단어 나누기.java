import java.io.*;
import java.util.*;

public class Main {

	static String str;
	static ArrayList<String> words=new ArrayList<>();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		str=br.readLine();
		Bruteforce(str,0,0,new String[3]);
		words.sort((o1, o2)->{ return o1.compareTo(o2); });
		
		System.out.println(words.get(0));
		br.close();
	}

	private static void Bruteforce(String word, int cnt, int pos, String[] sa) {
		if(cnt==2) {
			sa[2]=new StringBuffer(word.substring(pos, word.length())).reverse().toString();
			
			words.add(sa[0]+sa[1]+sa[2]);
			return;
		}
		
		for(int i=pos+1; i<word.length(); i++) {
			sa[cnt]=new StringBuffer(word.substring(pos, i)).reverse().toString();
			Bruteforce(word, cnt+1, i, sa);
		}
	}
	
}
