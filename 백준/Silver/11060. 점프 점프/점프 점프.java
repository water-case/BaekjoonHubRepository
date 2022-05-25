import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n=Integer.parseInt(br.readLine());
		int[] map=new int[n];
		st=new StringTokenizer(br.readLine()," ");
		for(int i=0; i<n; i++) map[i]=Integer.parseInt(st.nextToken());
		
		int ans=-1;
		ArrayDeque<int[]> q=new ArrayDeque<>();
		q.offer(new int[] {0,0});
		boolean[] v=new boolean[n];
		while(!q.isEmpty()) {
			int[] now=q.poll();
			
			if(now[0]==n-1) {
				ans=now[1];
				break;
			}
			
			if(v[now[0]]) continue;
			v[now[0]]=true;
			
			for(int i=1; i<=map[now[0]]; i++) {
				if(now[0]+i<n && !v[now[0]+i]) q.offer(new int[] {now[0]+i, now[1]+1});
			}
		}
		System.out.println(ans);
		br.close();
	}
	
}
