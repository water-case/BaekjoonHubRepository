import java.io.*;
import java.util.*;

public class Main {

	static int N,K,res=0;
	static boolean[] alpha;
	static char[][] words;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine(), " ");
		
		N=Integer.parseInt(st.nextToken());
		K=Integer.parseInt(st.nextToken());
		
		if(K<5) {
			System.out.println(0);
			return;
		}
		if(K==26) {
			System.out.println(N);
			return;
		}
			
		
		alpha=new boolean[26];
		alpha['a'-97]=true;
		alpha['n'-97]=true;
		alpha['t'-97]=true;
		alpha['i'-97]=true;
		alpha['c'-97]=true;
		
		words=new char[N][];
		for(int i=0; i<N; i++) {
			words[i]=br.readLine().toCharArray();
		}
		
		brute(5,0);
		
		System.out.println(res);
		br.close();
	}

	static void brute(int cnt, int start) {
		if(cnt==K) {
			int tmp=0;
			label:for(int i=0; i<N; i++) {
				for(int j=0; j<words[i].length; j++) {
					if(!alpha[words[i][j]-97]) continue label;
				}
				tmp++;
			}
			res=Math.max(res, tmp);
			return;
		}
		
		for(int i=start; i<26; i++) {
			if(!alpha[i]) {
				alpha[i]=true;
				brute(cnt+1, i+1);
				alpha[i]=false;
			}
		}
	}
	
}
