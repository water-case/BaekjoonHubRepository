import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N=Integer.parseInt(br.readLine());
		int[] cnt=new int[N+1];
		
		ArrayList<Integer>[] g=new ArrayList[N+1];
		for(int i=1; i<=N; i++) g[i]=new ArrayList<>();
		
		while(true) {
			st=new StringTokenizer(br.readLine()," ");
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			if(a==-1 && b==-1) break;
			g[a].add(b);
			g[b].add(a);
		}
		
		ArrayDeque<int[]> q=new ArrayDeque<>();
		for(int i=1; i<=N; i++) {
			boolean[] v=new boolean[N+1];
			q.offer(new int[] {i, 0});
			while(!q.isEmpty()) {
				int[] now=q.poll();
				if(v[now[0]]) continue;
				v[now[0]]=true;
				cnt[i]=now[1];
				for(int n:g[now[0]]) {
					if(!v[n]) q.offer(new int[] {n, now[1]+1});
				}
			}
		}
		ArrayList<Integer> candi=new ArrayList<>();
		int score=Integer.MAX_VALUE;
		for(int i=1; i<=N; i++) {
			if(score>cnt[i]) {
				score=cnt[i];
				candi=new ArrayList<>();
				candi.add(i);
			}
			else if(score==cnt[i]) {
				candi.add(i);
			}
		}
		
		StringBuilder sb=new StringBuilder();
		sb.append(score).append(" ").append(candi.size()).append("\n");
		for(Integer i:candi) sb.append(i).append(" ");
		System.out.println(sb.toString());
		br.close();
	}
	
}
