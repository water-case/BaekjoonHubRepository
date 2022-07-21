import java.io.*;
import java.util.*;

public class Main {

	static int N, S, res=0;
	static int[] arr;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		N=Integer.parseInt(st.nextToken());
		S=Integer.parseInt(st.nextToken());
		
		arr=new int[N];
		
		st=new StringTokenizer(br.readLine()," ");
		for(int i=0; i<N; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		bruteforce(0, 0, false);
		System.out.println(res);
		br.close();
	}

	private static void bruteforce(int idx, int sum, boolean chk) {
		if(sum==S && chk) {
			res++;
		}
		if(idx>=N) return;
		
		bruteforce(idx+1, sum+arr[idx], true);
		bruteforce(idx+1, sum, false);
	}
	
}
