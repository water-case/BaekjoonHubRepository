import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		StringTokenizer st;
		
		int T=Integer.parseInt(br.readLine());
		for(int tc=0; tc<T; tc++) {
			st=new StringTokenizer(br.readLine()," ");
			int n=Integer.parseInt(st.nextToken());
			int m=Integer.parseInt(st.nextToken());
			
			int res=0;
			for(double a=1; a<n; a++) {
				for(double b=a+1; b<n; b++) {
					double cal=(a*a+b*b+m)/(a*b);
					if(cal==(int)cal) res++;
				}
			}
			sb.append(res).append("\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
	
}
