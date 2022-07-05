import java.io.*;
import java.util.*;

public class Main {
	
	static int[][] g;
	static boolean[] v;
	static int N;

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N=Integer.parseInt(br.readLine());
		int M=Integer.parseInt(br.readLine());
		
		g=new int[N+1][N+1];
		for(int i=0; i<=N; i++)
			Arrays.fill(g[i], 999_999);
		
		for(int i=0; i<M; i++) {
			st=new StringTokenizer(br.readLine()," ");
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			
			g[a][b]=g[b][a]=1;
		}
		
		for(int k=1; k<=N; k++) {
			for(int i=1; i<=N; i++) {
				if(i==k) continue;
				for(int j=1; j<=N; j++) {
					if(j==i || j==k) continue;
					if(g[i][j] > g[i][k]+g[k][j])
					   g[i][j] = g[i][k]+g[k][j];
				}
			}
		}
		
		v=new boolean[N+1];
		ArrayList<Integer> res=new ArrayList<>();
		for(int i=1; i<=N; i++) {
			if(!v[i]) {
				res.add(bfs(i));
			}
		}
		Collections.sort(res);
		StringBuilder sb=new StringBuilder();
		sb.append(res.size()).append("\n");
		for(Integer i:res) sb.append(i).append("\n");
		System.out.println(sb.toString());
		br.close();
	}

	static int bfs(int n) {
		v[n]=true;
		
		ArrayList<Integer> group=new ArrayList<>();
		group.add(n);
		ArrayDeque<Integer> q=new ArrayDeque<>();
		q.offer(n);
		while(!q.isEmpty()) {
			int now=q.poll();
			
			for(int i=1; i<=N; i++) {
				if(v[i]) continue;
				if(g[now][i]!=999_999) {
					v[i]=true;
					group.add(i);
					q.offer(i);
				}
			}
		}
		
		int idx=0;
		int min=Integer.MAX_VALUE;
		
		for(Integer n1:group) {
			int tmin=0;
			
			for(Integer n2:group) {
				if(n1==n2) continue;
				tmin=Math.max(tmin, g[n1][n2]);
			}
			
			if(min>tmin) {
				min=tmin;
				idx=n1;
			}
		}
		
		return idx;
	}
	
}
