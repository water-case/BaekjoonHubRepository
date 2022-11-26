import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		int[] basket=new int[N];
		for(int i=0; i<N; i++) basket[i]=i+1;

		while(M-->0) {
			st=new StringTokenizer(br.readLine()," ");
			int start=Integer.parseInt(st.nextToken())-1;
			int end=Integer.parseInt(st.nextToken())-1;
			int mid=Integer.parseInt(st.nextToken())-1;
			
			int[] tmp=new int[end-start+1];
			for(int i=mid; i<=end; i++) tmp[i-mid]=basket[i];
			for(int i=start, j=end-mid+1; i<mid; i++, j++) tmp[j]=basket[i];
			
			for(int i=start; i<=end; i++) basket[i]=tmp[i-start];
		}
		
		StringBuilder sb=new StringBuilder();
		for(int i:basket) sb.append(i).append(" ");
		System.out.println(sb.toString());
		br.close();
	}
	
}
