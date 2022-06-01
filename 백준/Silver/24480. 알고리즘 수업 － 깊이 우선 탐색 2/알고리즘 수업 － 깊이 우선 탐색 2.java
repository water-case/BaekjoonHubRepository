import java.io.*;
import java.util.*;

public class Main {

	static ArrayList<Integer>[] g;
	static int[] v;
	static int cnt;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		int R=Integer.parseInt(st.nextToken());
		
		g=new ArrayList[N+1];
		for(int i=1; i<=N; i++) g[i]=new ArrayList<>();
		for(int i=0; i<M; i++) {
			st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			g[a].add(b);
			g[b].add(a);
		}
		for(int i=1; i<=N; i++) Collections.sort(g[i], (o1, o2) -> -Integer.compare(o1, o2));
		
		v=new int[N+1];
		cnt=1;
		dfs(R);
		
		StringBuilder sb=new StringBuilder();
		for(int i=1; i<=N; i++)
			sb.append(v[i]).append("\n");
		
		System.out.println(sb.toString());
		br.close();
	}
	
	static void dfs(int R) {
		if(v[R]==0) {
			v[R]=cnt;
			cnt++;
		} else return;
		
		for(int i:g[R])
			dfs(i);
	}
	
}
