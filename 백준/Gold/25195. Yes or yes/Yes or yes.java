import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		ArrayList<Integer>[] g=new ArrayList[N+1];
		for(int i=1; i<=N; i++) g[i]=new ArrayList<>();
		for(int i=0; i<M; i++) {
			st=new StringTokenizer(br.readLine()," ");
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			g[a].add(b);
		}
		
		int S=Integer.parseInt(br.readLine());
		st=new StringTokenizer(br.readLine()," ");
		for(int i=0; i<S; i++) g[Integer.parseInt(st.nextToken())].add(Integer.MAX_VALUE);
		
		String ans="Yes";
		
		ArrayDeque<Integer> q=new ArrayDeque<>();
		q.offer(1);
		while(!q.isEmpty()) {
			int now=q.poll();
			
			if(g[now].size()==0) {
				ans="yes";
				break;
			}
			if(g[now].get(g[now].size()-1)==Integer.MAX_VALUE) continue;
			
			for(int i:g[now]) q.offer(i);
		}
		
		System.out.println(ans);
		br.close();
	}
	
}
