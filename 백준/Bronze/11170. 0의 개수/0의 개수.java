import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		StringTokenizer st;
		
		int T=Integer.parseInt(br.readLine());
		
		for(int tc=0; tc<T; tc++) {
			st=new StringTokenizer(br.readLine()," ");
			
			int N=Integer.parseInt(st.nextToken());
			int M=Integer.parseInt(st.nextToken());
			
			int res=0;
			for(int i=N; i<=M; i++) {
				int j=i;
				while(true) {
					if(j%10==0) res++;
					j/=10;
					if(j==0) break;
				}
			}
			sb.append(res).append("\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
	
}
