import java.io.*;
import java.util.*;

public class Main {
	
	static int N,m,M,T,R,X;
	static int res=-1;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		N=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		T=Integer.parseInt(st.nextToken());
		R=Integer.parseInt(st.nextToken());
		X=m;
		
		if(M-m>=T) simulation();
		
		System.out.println(res);
		br.close();
	}

	private static void simulation() {
		int time=0;
		while(N>0) {
			time++;
			if(X+T<=M) {
				X+=T;
				N--;
			} else {
				X-=R;
				if(X<m) X=m;
			}
		}
		res=time;
	}
	
}
