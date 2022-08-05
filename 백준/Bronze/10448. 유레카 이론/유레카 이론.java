import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int[] triangle=new int[1001];
		for(int i=1; i<=1000; i++) {
			triangle[i]=triangle[i-1]+i;
		}
		
		int T=Integer.parseInt(br.readLine());
		label:for(int tc=0; tc<T; tc++) {
			int n=Integer.parseInt(br.readLine());
			
			for(int i=1; i<50; i++) {
				for(int j=1; j<=50; j++) {
					for(int k=1; k<=50; k++) {
						if(triangle[i]+triangle[j]+triangle[k] == n) {
							System.out.println(1); continue label;
						}
					}
				}
			}
			System.out.println(0);
		}
		
		br.close();
	}
	
}
