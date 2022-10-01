import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		boolean[] nums=new boolean[N+1];
		
		
		st=new StringTokenizer(br.readLine()," ");
		for(int i=0; i<M; i++) {
			int K=Integer.parseInt(st.nextToken());
			
			int idx=K;
			do {
				nums[idx]=true;
				idx+=K;
			} while(idx<=N);
		}
		
		int res=0;
		for(int i=1; i<=N; i++) {
			if(nums[i]) res+=i;
		}
		
		System.out.println(res);
		br.close();
	}
	
}
