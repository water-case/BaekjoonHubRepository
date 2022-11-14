import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int max=-1;
		int r=0, c=0;
		for(int i=1; i<=9; i++) {
			st=new StringTokenizer(br.readLine()," ");
			for(int j=1; j<=9; j++) {
				int n=Integer.parseInt(st.nextToken());
				if(n>max) {
					max=n;
					r=i;
					c=j;
				}
			}
		}
		
		System.out.println(max);
		System.out.println(r+" "+c);
		br.close();
	}
	
}
