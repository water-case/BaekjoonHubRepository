import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int N=Integer.parseInt(st.nextToken()); // 수빈이 위치
		int K=Integer.parseInt(st.nextToken()); // 동생 위치
		
		Integer[] move=new Integer[100_001];
		ArrayDeque<int[]> q=new ArrayDeque<>();
		q.offer(new int[] {N, 0});
		
		int ans=0;
		int cnt=0;
		while(!q.isEmpty()) {
			int[] now=q.poll();
			int pos=now[0];
			
			move[pos]=now[1];
			
			if(pos==K) {
				ans=now[1];
				cnt++;
				while(!q.isEmpty()) {
					int[] now2=q.poll();
					int pos2=now2[0];
					if(now[1]!=now2[1]) break;
					if(pos2==K) {
						cnt++;
					}
				}
				break;
			}
			if(pos-1>=0 && pos-1<=100_000 && move[pos-1]==null) q.offer(new int[] {pos-1, now[1]+1});
			if(pos+1>=0 && pos+1<=100_000 && move[pos+1]==null) q.offer(new int[] {pos+1, now[1]+1});
			if(pos*2>=0 && pos*2<=100_000 && move[pos*2]==null) q.offer(new int[] {pos*2, now[1]+1});
		}
		
		System.out.println(ans);
		System.out.println(cnt);
		br.close();
	}
	
}
