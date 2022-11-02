import java.io.*;
import java.util.*;

public class Main {

	static int[] ball;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		ball=new int[N+1];
		for(int i=1; i<=N; i++) ball[i]=i;
		
		for(int t=0; t<M; t++) {
			st=new StringTokenizer(br.readLine()," ");
			int i=Integer.parseInt(st.nextToken());
			int j=Integer.parseInt(st.nextToken());
			swap(i,j);
		}

		StringBuilder sb=new StringBuilder();
		for(int i=1; i<=N; i++) sb.append(ball[i]).append(" ");
		System.out.println(sb.toString());
		br.close();
	}
	
	private static void swap(int i, int j) {
		int tmp=ball[i];
		ball[i]=ball[j];
		ball[j]=tmp;
	}
	
}
