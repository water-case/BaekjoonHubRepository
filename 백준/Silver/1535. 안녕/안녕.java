import java.io.*;
import java.util.*;

public class Main {

	static int res, N;
	static int[] L, J;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1, st2;
		
		N=Integer.parseInt(br.readLine());
		L=new int[N];
		J=new int[N];
		
		st1=new StringTokenizer(br.readLine()," ");
		st2=new StringTokenizer(br.readLine()," ");
		
		for(int i=0; i<N; i++) {
			L[i]=Integer.parseInt(st1.nextToken());
			J[i]=Integer.parseInt(st2.nextToken());
		}
		
		Subset(0, 100, 0);

		System.out.println(res);
		br.close();
	}

	static void Subset(int cnt, int life, int joy) {
		if(life<=0) {
			return;
		}
		if(cnt==N) {
			res=Math.max(res, joy);
			return;
		}
		
		Subset(cnt+1, life-L[cnt], joy+J[cnt]);
		Subset(cnt+1, life, joy);
	}
	
}
