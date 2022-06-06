import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		StringTokenizer st;

		char[] s=br.readLine().toCharArray();		
		int[][] cnt=new int[s.length][26];
		
		cnt[0][s[0]-97]++;
		for(int i=1; i<s.length; i++) {
			cnt[i]=cnt[i-1].clone();
			cnt[i][s[i]-97]++;
		}
		
		int q=Integer.parseInt(br.readLine());
		for(int i=0; i<q; i++) {
			st=new StringTokenizer(br.readLine()," ");
			int a=st.nextToken().charAt(0)-97;
			int l=Integer.parseInt(st.nextToken());
			int r=Integer.parseInt(st.nextToken());
			
			if(l==0) sb.append(cnt[r][a]).append("\n");
			else     sb.append(cnt[r][a]-cnt[l-1][a]).append("\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
	
}
