import java.io.*;
import java.util.*;

public class Main {

	static int N,d,k,c,res=-1;
	static int[] dish,dcnt;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		N=Integer.parseInt(st.nextToken());
		d=Integer.parseInt(st.nextToken());
		k=Integer.parseInt(st.nextToken());
		c=Integer.parseInt(st.nextToken());
		
		dish=new int[N+k-1];
		dcnt=new int[d+1];
		for(int i=0; i<N; i++) dish[i]=Integer.parseInt(br.readLine());
		for(int i=0; i<k-1; i++) dish[N+i]=dish[i];
		
		brute(0,0);
		
		System.out.println(res);
		br.close();
	}

	private static void brute(int idx, int cnt) {
		if(idx==N+k-1) return;
		
		if(dcnt[c]==0) res=Math.max(res, cnt+1);
		else res=Math.max(res, cnt);
		
		if(idx>=k) {
			if(dcnt[dish[idx-k]]==1) cnt--;
			dcnt[dish[idx-k]]--;
		}
		if(dcnt[dish[idx]]==0) cnt++;
		dcnt[dish[idx]]++;
		
		brute(idx+1, cnt);
	}
	
}
