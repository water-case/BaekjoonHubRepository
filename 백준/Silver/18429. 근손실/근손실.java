import java.io.*;
import java.util.*;

public class Main {

	static int N, K, res=0;
	static int[] warr;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine(), " ");
		
		N=Integer.parseInt(st.nextToken());
		K=Integer.parseInt(st.nextToken());

		st=new StringTokenizer(br.readLine(), " ");
		warr=new int[N];
		for(int i=0; i<N; i++) warr[i]=Integer.parseInt(st.nextToken());
		
		Perm(0,new boolean[N],500);

		System.out.println(res);
		br.close();
	}

	private static void Perm(int cnt, boolean[] v, int weight) {
		if(weight<500) return;
		if(cnt==N) {
			res++;
			return;
		}
		
		for(int i=0; i<N; i++) {
			if(v[i]) continue;
			v[i]=true;
			Perm(cnt+1,v,weight+warr[i]-K);
			v[i]=false;
		}
		
	}
	
}
