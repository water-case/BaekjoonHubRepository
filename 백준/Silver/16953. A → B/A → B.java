import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine(), " ");
		
		int a=Integer.parseInt(st.nextToken());
		int b=Integer.parseInt(st.nextToken());
		
		ArrayDeque<long[]> q=new ArrayDeque<>();
		q.offer(new long[] {a, 0});
		
		int ans=0;
		while(!q.isEmpty()) {
			long[] now=q.poll();
			
			if(now[0] == b) {
				ans=(int) now[1]+1;
				break;
			}
			if(now[0] > b) continue;
			
			if(now[0]*2<=b) q.offer(new long[] {now[0]*2, now[1]+1});
			if(now[0]*10+1<=b) q.offer(new long[] {now[0]*10+1, now[1]+1});
		}
		
		if(ans==0) ans=-1;
		System.out.println(ans);
		br.close();
	}
	
}
