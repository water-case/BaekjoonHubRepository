import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int N1=Integer.parseInt(st.nextToken());
		int N2=Integer.parseInt(st.nextToken());
		
		char[] ant1=br.readLine().toCharArray();
		char[] ant2=br.readLine().toCharArray();
		char[] res=new char[N1+N2];
		boolean[] direct=new boolean[N1+N2];
		
		for(int i=0; i<N1; i++) {
			res[i]=ant1[N1-i-1];
			direct[i]=true;
		}
		for(int i=0; i<N2; i++) {
			res[N1+i]=ant2[i];
			direct[N1+i]=false;
		}
		
		int T=Integer.parseInt(br.readLine());
		while(T-->0) {
			for(int i=0; i<N1+N2-1; i++) {
				if(direct[i]&&!direct[i+1]) {
					char ctmp=res[i];
					res[i]=res[i+1];
					res[i+1]=ctmp;
					
					boolean btmp=direct[i];
					direct[i]=direct[i+1];
					direct[i+1]=btmp;
					i++;
				}
			}
		}

		StringBuilder sb=new StringBuilder();
		for(char c:res) sb.append(c);
		
		System.out.println(sb.toString());
		br.close();
	}
	
}
