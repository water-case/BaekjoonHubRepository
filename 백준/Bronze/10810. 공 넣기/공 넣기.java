import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		int[] basket=new int[N+1];
		for(int idx=0; idx<M; idx++) {
			st=new StringTokenizer(br.readLine()," ");
			int i=Integer.parseInt(st.nextToken());
			int j=Integer.parseInt(st.nextToken());
			int k=Integer.parseInt(st.nextToken());
			
			for(int s=i; s<=j; s++) {
				basket[s]=k;
			}
		}
		
		for(int i=1; i<=N; i++) {
			System.out.print(basket[i]+" ");
		}
		br.close();
	}
	
}
