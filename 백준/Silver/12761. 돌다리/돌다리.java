import java.io.*;
import java.util.*;

public class Main {

	static final int MAX=100_000;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int A=Integer.parseInt(st.nextToken()); // 스카이 콩콩A의 힘
		int B=Integer.parseInt(st.nextToken()); // 스카이 콩콩B의 힘
		int N=Integer.parseInt(st.nextToken()); // 동규의 현재 위치
		int M=Integer.parseInt(st.nextToken()); // 주미의 현재 위치
		
		boolean[] v=new boolean[MAX+1];
		ArrayDeque<int[]> q=new ArrayDeque<>();
		q.offer(new int[] {N, 0});
		
		int ans=0;
		while(!q.isEmpty()) {
			int[] now=q.poll();
			
			if(v[now[0]]) continue;
			v[now[0]]=true;
			
			if(now[0]==M) {
				ans=now[1];
				break;
			}
			
			if(now[0]+1<=MAX) q.offer(new int[] {now[0]+1, now[1]+1});
			if(now[0]-1>=0)   q.offer(new int[] {now[0]-1, now[1]+1});
			if(now[0]+A<=MAX) q.offer(new int[] {now[0]+A, now[1]+1});
			if(now[0]-A>=0)   q.offer(new int[] {now[0]-A, now[1]+1});
			if(now[0]+B<=MAX) q.offer(new int[] {now[0]+B, now[1]+1});
			if(now[0]-B>=0)   q.offer(new int[] {now[0]-B, now[1]+1});
			if(now[0]*A<=MAX) q.offer(new int[] {now[0]*A, now[1]+1});
			if(now[0]*B<=MAX) q.offer(new int[] {now[0]*B, now[1]+1});
			
		}

		System.out.println(ans);
		br.close();
	}
	
}
