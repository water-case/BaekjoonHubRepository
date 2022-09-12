import java.io.*;
import java.util.*;

public class Main {

	static String word, res="zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
	static ArrayList<String> words=new ArrayList<>();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		word=br.readLine();
		Bruteforce(0,0,new String[3]);
		
		System.out.println(res);
		br.close();
	}

	private static void Bruteforce(int cnt, int pos, String[] sa) {
		if(cnt==2) {
			sa[2]=new StringBuffer(word.substring(pos, word.length())).reverse().toString();
			
			String tmp=sa[0]+sa[1]+sa[2];
			if(res.compareTo(tmp)>0) {
				res=tmp;
			}
			return;
		}
		
		for(int i=pos+1; i<word.length(); i++) {
			sa[cnt]=new StringBuffer(word.substring(pos, i)).reverse().toString();
			Bruteforce(cnt+1, i, sa);
		}
	}
	
}
