import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine(), " ");

		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		int ans=0;
		boolean[] v=new boolean[100001];
		PriorityQueue<int[]> pq=new PriorityQueue<>((o1, o2)->Integer.compare(o1[1], o2[1]));
		pq.offer(new int[] {N, 0});
		v[N]=true;
		while(!pq.isEmpty()) {
			int[] now=pq.poll();
			
			v[now[0]]=true;
			
			if(now[0]==M) {
				ans=now[1];
				break;
			}
			
			if(now[0]-1>=0 && !v[now[0]-1]) pq.offer(new int[] {now[0]-1, now[1]+1});
			if(now[0]+1<=100000 && !v[now[0]+1]) pq.offer(new int[] {now[0]+1, now[1]+1});
			if(now[0]*2<=100000 && !v[now[0]*2]) pq.offer(new int[] {now[0]*2, now[1]});
		}
		System.out.println(ans);
		br.close();
	}
	
}
