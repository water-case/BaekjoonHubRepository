import java.io.*;
import java.util.*;

public class Main {

	static int N, max=-1, min=-1;
	static char[] sign;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		N=Integer.parseInt(br.readLine());
		
		sign=new char[N];
		String[] s=br.readLine().split(" ");
		for(int i=0; i<N; i++) {
			sign[i]=s[i].charAt(0);
		}
		
		comb_max(0, new boolean[10], new int[N+1]);
		comb_min(0, new boolean[10], new int[N+1]);
		
		br.close();
	}
	
	static void comb_max(int cnt, boolean[] v, int[] res) {
		if(max!=-1) return;
		if(cnt==N+1) {
			for(int i=0; i<N; i++) {
				if(sign[i]=='>') {
					if(res[i]<res[i+1]) return;
				} else {
					if(res[i]>res[i+1]) return;
				}
			}
			for(int i=0; i<=N; i++) {
				System.out.print(res[i]);
			}
			System.out.println();
			max=0;
			return;
		}
		
		for(int i=9; i>=0; i--) {
			if(v[i]) continue;
			res[cnt]=i;
			v[i]=true;
			comb_max(cnt+1, v, res);
			v[i]=false;
		}
	}
	static void comb_min(int cnt, boolean[] v, int[] res) {
		if(min!=-1) return;
		
		if(cnt==N+1) {
			for(int i=0; i<N; i++) {
				if(sign[i]=='>') {
					if(res[i]<res[i+1]) return;
				} else {
					if(res[i]>res[i+1]) return;
				}
			}
			for(int i=0; i<=N; i++) {
				System.out.print(res[i]);
			}
			System.out.println();
			min=0;
			return;
		}
		
		for(int i=0; i<=9; i++) {
			if(v[i]) continue;
			res[cnt]=i;
			v[i]=true;
			comb_min(cnt+1, v, res);
			v[i]=false;
		}
	}
	
}
