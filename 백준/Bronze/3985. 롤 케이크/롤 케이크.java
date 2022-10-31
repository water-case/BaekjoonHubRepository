import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int L=Integer.parseInt(br.readLine());
		int N=Integer.parseInt(br.readLine());
		
		int[] cake=new int[L+1];
		int res1=0, res2=0, max=0;;
		
		for(int i=1; i<=N; i++) {
			st=new StringTokenizer(br.readLine()," ");
			int p=Integer.parseInt(st.nextToken());
			int k=Integer.parseInt(st.nextToken());
			
			int cal=k-p+1;
			if(cal>max) {
				res1=i;
				max=cal;
			}
			
			for(int j=p; j<=k; j++) {
				if(cake[j]!=0) continue;
				cake[j]=i;
			}
		}
		System.out.println(res1);
		
		int[] cnt=new int[N+1];
		for(int i=1; i<=L; i++) cnt[cake[i]]++;

		max=0;
		for(int i=1; i<=N; i++) {
			if(max<cnt[i]) {
				res2=i;
				max=cnt[i];
			}
		}
		
		System.out.println(res2);
		br.close();
	}
	
}
