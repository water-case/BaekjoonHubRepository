import java.io.*;
import java.util.*;

public class Main {

	static int N, res=Integer.MAX_VALUE;
	static int[][] arr;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N=Integer.parseInt(br.readLine());
		arr=new int[N][N];
		
		for(int i=0; i<N; i++) {
			st=new StringTokenizer(br.readLine()," ");
			for(int j=0; j<N; j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
				arr[j][i]+=arr[i][j];
			}
		}
		
		SubSet(0,new boolean[N]);
		System.out.println(res);

		br.close();
	}
	
	static void SubSet(int cnt, boolean[] v) {
		if(cnt==N) return;
		
		int res1=0, res2=0;
		for(int i=0; i<N-1; i++) {
			for(int j=i+1; j<N; j++) {
				if(v[i]&&v[j]) {
					res1+=arr[i][j];
				}
				if(!v[i]&&!v[j]) {
					res2+=arr[i][j];
				}
			}
		}
		res=Math.min(res, Math.abs(res1-res2));
		
		v[cnt]=true;
		SubSet(cnt+1,v);
		v[cnt]=false;
		SubSet(cnt+1,v);
	}
	
}
