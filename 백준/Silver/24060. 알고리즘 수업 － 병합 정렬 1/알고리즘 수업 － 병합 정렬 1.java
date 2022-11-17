import java.io.*;
import java.util.*;

public class Main {

	static int N, K, res=-1, cnt=0;
	static int[] A;
	static int[] tmp;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		N=Integer.parseInt(st.nextToken());
		K=Integer.parseInt(st.nextToken());
		A=new int[N];
		tmp=new int[N];
		
		st=new StringTokenizer(br.readLine()," ");
		for(int i=0; i<N; i++) {
			A[i]=Integer.parseInt(st.nextToken());
		}
		
		merge_sort(0,N-1);
		
		System.out.println(res);
		br.close();
	}
	
	private static void merge_sort(int p, int r) {
		if(p<r) {
			int q=(p+r)/2;
			merge_sort(p,q);
			merge_sort(q+1,r);
			merge(p,q,r);
		}
	}

	private static void merge(int p, int q, int r) {
		int i=p, j=q+1, t=0;
		while(i<=q && j<=r) {
			if(A[i]<=A[j]) {
				tmp[t++]=A[i++];
			} else {
				tmp[t++]=A[j++];
			}
		}
		while(i<=q) {
			tmp[t++]=A[i++];
		}
		while(j<=r) {
			tmp[t++]=A[j++];
		}
		i=p; t=0;
		while(i<=r) {
			A[i++]=tmp[t++];
			cnt++;
			if(cnt==K) {
				res=A[i-1];
			}
		}
	}
	
}
