import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n=Integer.parseInt(br.readLine());
		
		boolean[][] g=new boolean[26][26];
		
		for(int i=0; i<n; i++) {
			st=new StringTokenizer(br.readLine()," ");
			int s=st.nextToken().charAt(0)-97;
			st.nextToken(); // is 지우기
			int e=st.nextToken().charAt(0)-97;
			g[s][e]=true;
		}
		
		for(int k=0; k<26; k++) {
			for(int i=0; i<26; i++) {
				if(i==k) continue;
				for(int j=0; j<26; j++) {
					if(j==k || j==i) continue;
					if(!g[i][j] && (g[i][k] && g[k][j])) {
						g[i][j]=true;
					}
				}
			}
		}
		
		StringBuilder sb=new StringBuilder();
		int m=Integer.parseInt(br.readLine());
		for(int i=0; i<m; i++) {
			st=new StringTokenizer(br.readLine()," ");
			int s=st.nextToken().charAt(0)-97;
			st.nextToken(); // is 지우기
			int e=st.nextToken().charAt(0)-97;
			if(g[s][e]) sb.append("T").append("\n");
			else sb.append("F").append("\n");
		}
		System.out.println(sb.toString());
		br.close();
	}
	
}
