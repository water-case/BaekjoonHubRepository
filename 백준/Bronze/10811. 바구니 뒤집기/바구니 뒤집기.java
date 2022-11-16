import java.io.*;
import java.util.*;

public class Main {

	static int[] basket;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		basket=new int[N+1];
		for(int i=1; i<=N; i++) basket[i]=i;

		while(M-->0) {
			st=new StringTokenizer(br.readLine()," ");
			int i=Integer.parseInt(st.nextToken());
			int j=Integer.parseInt(st.nextToken());
			
			Reverse(i, j);
		}
		
		StringBuilder sb=new StringBuilder();
		for(int i=1; i<=N; i++) {
			sb.append(basket[i]).append(" ");
		}
		System.out.println(sb.toString());
		br.close();
	}

	private static void Reverse(int i, int j) {
		int size=j-i;
		if(size==0) return;
		
		int[] tmp=new int[size+1];
		for(int s=i; s<=j; s++) {
			tmp[s-i]=basket[s];
		}
		for(int s=j, idx=0; s>=i; s--) {
			basket[s]=tmp[idx++];
		}
		
	}
	
}
