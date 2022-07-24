import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int N=Integer.parseInt(br.readLine());
		
		perm(N, 0, new int[N], new boolean[N+1]);
		
		br.close();
	}

	private static void perm(int n, int cnt, int[] list, boolean[] v) {
		if(cnt==n) {
			for(int i=0; i<n; i++) {
				System.out.print(list[i]+" " );
			}
			System.out.println();
		}
		
		for(int i=1; i<=n; i++) {
			if(!v[i]) {
				v[i]=true;
				list[cnt]=i;
				perm(n, cnt+1, list, v);
				v[i]=false;
			}
		}
	}
	
}
