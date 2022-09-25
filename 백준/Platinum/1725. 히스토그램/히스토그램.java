import java.io.*;
import java.util.*;

public class Main {

	static int N;
	static int[] tree, nums;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		N=Integer.parseInt(br.readLine());
		
		nums=new int[N];
		for(int i=0; i<N; i++) nums[i]=Integer.parseInt(br.readLine());
		
		tree=new int[N*4];
		init(0,N-1,1);
		
		System.out.println(getMax(0,N-1));
		br.close();
	}

	private static int getMax(int left, int right) {
		int idx=query(0,N-1,1,left,right);
		int res=(right-left+1)*nums[idx];
		
		if(idx+1 <= right) res=Math.max(res, getMax(idx+1, right));
		if(idx-1 >= left) res=Math.max(res, getMax(left, idx-1));
		return res;
	}

	private static int query(int start, int end, int node, int left, int right) {
		if(left>end || right<start) return -1;
		if(end<=right && start>=left) return tree[node];
		
		int mid=(start+end)/2;
		int m1=query(start,mid,node*2,left,right);
		int m2=query(mid+1,end,node*2+1,left,right);
		
		if(m1==-1) return m2;
		else if(m2==-1) return m1;
		else {
			if(nums[m1] <= nums[m2]) return m1;
			else return m2;
		}
	}

	private static void init(int start, int end, int node) {
		if(start==end) {
			tree[node]=start;
			return;
		}
		
		int mid=(start+end)/2;
		init(start,mid,node*2);
		init(mid+1,end,node*2+1);
		
		if(nums[tree[node*2]] <= nums[tree[node*2+1]])
			tree[node]=tree[node*2];
		else
			tree[node]=tree[node*2+1];
	}
	
}
