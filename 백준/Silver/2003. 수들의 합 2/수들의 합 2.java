import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		int[] arr=new int[N];
		st=new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		int res=0;
		for(int i=0; i<N; i++) {
			int idx=i;
			int sum=arr[idx++];
			while(sum<=M) {
				if(sum==M) {
					res++;
					break;
				}
				if(idx>=N) break;
				sum+=arr[idx++];
			}
		}
		
		System.out.println(res);
		br.close();
	}
	
}
