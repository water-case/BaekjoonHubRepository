import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		int sum=0;
		int[] cnt=new int[M];
		st=new StringTokenizer(br.readLine()," ");
		for(int i=0; i<N; i++) {
			int n=Integer.parseInt(st.nextToken())%M;
			sum=(sum+n)%M;
			cnt[sum]++;
		}

		long ans=cnt[0];
		for(int i=0; i<M; i++) {
			ans+=(long)cnt[i]*(cnt[i]-1)/2;
		}
		
		System.out.println(ans);
		br.close();
	}
	
}
