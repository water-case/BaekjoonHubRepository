import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int N=Integer.parseInt(st.nextToken());
		int X=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		
		while(K-->0) {
			st=new StringTokenizer(br.readLine()," ");
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			
			     if(a==X) X=b;
			else if(b==X) X=a;
		}
		
		System.out.println(X);
		br.close();
	}
	
}
