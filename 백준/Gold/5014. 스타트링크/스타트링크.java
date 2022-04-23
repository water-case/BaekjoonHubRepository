import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");

		int F=Integer.parseInt(st.nextToken());
		int S=Integer.parseInt(st.nextToken());
		int G=Integer.parseInt(st.nextToken());
		int U=Integer.parseInt(st.nextToken());
		int D=Integer.parseInt(st.nextToken());
		
		int ans=-1;
		ArrayDeque<int[]> q=new ArrayDeque<>();
		boolean[] v=new boolean[F+1];
		q.offer(new int[] {S, 0});
		v[S]=true;
		while(!q.isEmpty()) {
			int[] now=q.poll();
			
			if(now[0]==G) {
				ans=now[1];
				break;
			}
			
			if(now[0]+U<=F && !v[now[0]+U]) {
				v[now[0]+U]=true;
				q.offer(new int[] {now[0]+U, now[1]+1});
			}
			if(now[0]-D>0 && !v[now[0]-D]) {
				v[now[0]-D]=true;
				q.offer(new int[] {now[0]-D, now[1]+1});
			}
		}
		if(ans==-1) System.out.println("use the stairs");
		else       System.out.println(ans);
		br.close();
	}
	
}
