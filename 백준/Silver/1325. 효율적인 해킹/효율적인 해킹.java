import java.io.*;
import java.util.*;

public class Main {

	static int N,M,cnt;
	static int[] result;
	static ArrayList<Integer>[] g;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		g=new ArrayList[N+1];
		for(int i=1; i<=N; i++) g[i]=new ArrayList<>();
		
		for(int i=0; i<M; i++) {
			st=new StringTokenizer(br.readLine()," ");
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			g[a].add(b);
		}
		
		result=new int[N+1];
		for(int i=1; i<=N; i++) {
			bfs(i);
		}

		int max=Integer.MIN_VALUE;
		for(int i=1; i<=N; i++) {
			max=Math.max(result[i], max);
		}

		StringBuilder sb=new StringBuilder();
		for(int i=1; i<=N; i++) {
			if(max==result[i]) sb.append(i).append(" ");
		}
		System.out.println(sb.toString());
		br.close();
	}

	static void bfs(int n) {
		ArrayDeque<Integer> q=new ArrayDeque<>();
		boolean[] v=new boolean[N+1];
		q.offer(n);
		v[n]=true;
		while(!q.isEmpty()) {
			int now=q.poll();
			for(int next:g[now]) {
				if(v[next]) continue;
				v[next]=true;
				result[next]++;
				q.offer(next);
			}
		}
	}
	
}
