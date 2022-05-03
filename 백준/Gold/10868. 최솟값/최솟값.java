import java.io.*;
import java.util.*;

public class Main {

	static int[] arr, tree;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		StringTokenizer st=new StringTokenizer(br.readLine()," ");

		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		arr=new int[N+1];
		tree=new int[N*4];
		
		for(int i=1; i<=N; i++) arr[i]=Integer.parseInt(br.readLine());
		
		init(1, N, 1);
		
		for(int i=0; i<M; i++) {
			st=new StringTokenizer(br.readLine()," ");
			int start=Integer.parseInt(st.nextToken());
			int end=Integer.parseInt(st.nextToken());
			sb.append(Query(1,N,1,start,end)).append("\n");
		}
		System.out.println(sb.toString());
		br.close();
	}

	static int Query(int start, int end, int node, int left, int right) {
		if(left>end || right<start) return Integer.MAX_VALUE;
		if(left<=start && right>=end) return tree[node];
		int mid=(start+end)/2;
		return Math.min(Query(start, mid, node*2, left, right), Query(mid+1, end, node*2+1, left, right));
	}

	static int init(int start, int end, int node) {
		if(start==end) return tree[node]=arr[start];
		int mid=(start+end)/2;
		return tree[node]=Math.min(init(start, mid, node*2), init(mid+1, end, node*2+1));
	}
	
}
