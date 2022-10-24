import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n=Integer.parseInt(br.readLine());
		
		int p1=100, p2=100;
		while(n-->0) {
			st=new StringTokenizer(br.readLine()," ");
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			
			     if(a>b) p2-=a;
			else if(a<b) p1-=b;
		}
		
		System.out.println(p1);
		System.out.println(p2);
		br.close();
	}
	
}
