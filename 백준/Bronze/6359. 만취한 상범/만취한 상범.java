import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		int T=Integer.parseInt(br.readLine());
		while(T-->0) {
			int n=Integer.parseInt(br.readLine());
			
			int res=simulation(n);
			sb.append(res).append("\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}

	private static int simulation(int n) {
		int res=0;
		
		boolean[] room=new boolean[n+1];
		for(int k=2; k<=n; k++) {
			for(int idx=k; n>=idx; idx+=k) {
				if(room[idx]) room[idx]=false;
				else          room[idx]=true;
			}
		}
		
		for(int i=1; i<=n; i++)
			if(!room[i]) res++;
		
		return res;
	}
	
}
