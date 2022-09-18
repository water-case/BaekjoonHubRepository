import java.io.*;
import java.util.*;

public class Main {

	static int N,M,res;
	static int[] map;
	static boolean[] v;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine(), " ");
		
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		map=new int[N*M];
		v=new boolean[N*M];
		
		for(int i=0; i<N; i++) {
			String[] sa=br.readLine().split("");
			for(int j=0; j<M; j++)  map[i*M+j]=Integer.parseInt(sa[j]);
		}
		
		pick(0);
		System.out.println(res);
		
		br.close();
	}

	private static void pick(int pos) {
		if(pos==N*M) {
			check();
			return;
		}
		
		v[pos]=true;
		pick(pos+1);
		v[pos]=false;
		pick(pos+1);
	}

	private static void check() {
		int sum=0;
		
		for(int i=0; i<N; i++) {
			int tmp=0;
			for(int j=0; j<M; j++) {
				if(v[i*M+j]) {
					tmp=tmp*10+map[i*M+j];
				} else {
					sum+=tmp;
					tmp=0;
				}
			}
			sum+=tmp;
		}
		
		for(int j=0; j<M; j++) {
			int tmp=0;
			for(int i=0; i<N; i++) {
				if(!v[i*M+j]) {
					tmp=tmp*10+map[i*M+j];
				} else {
					sum+=tmp;
					tmp=0;
				}
			}
			sum+=tmp;
		}
		
		res=Math.max(res, sum);
	}
	
}
