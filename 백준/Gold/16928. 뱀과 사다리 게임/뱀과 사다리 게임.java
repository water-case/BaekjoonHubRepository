import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");

		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		int[] map=new int[101];
		for(int i=1; i<=99; i++) map[i]=i;
		map[100]=100;
		
		for(int i=0; i<N+M; i++) {
			st=new StringTokenizer(br.readLine()," ");
			int ladd=Integer.parseInt(st.nextToken());
			int goal=Integer.parseInt(st.nextToken());
			map[ladd]=goal;
		}
		
		int ans=0;
		ArrayDeque<int[]> q=new ArrayDeque<>();
		q.offer(new int[] {1,0});
		boolean[] v=new boolean[101];
		while(!q.isEmpty()) {
			int[] now=q.poll();
			
			if(now[0]==100) {
				ans=now[1];
				break;
			}
			
			if(v[now[0]]) continue;
			v[now[0]]=true;
			
			for(int i=1; i<=6; i++) {
				if(now[0]+i<=100 && !v[now[0]+i])
					q.offer(new int[] {map[now[0]+i], now[1]+1});
			}
		}
		
		System.out.println(ans);
		br.close();
	}
	
}
