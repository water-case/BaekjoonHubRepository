import java.io.*;
import java.util.*;

public class Main {

	static int N,mcnt,res=Integer.MAX_VALUE;
	static boolean[] door;
	static ArrayList<Integer> move=new ArrayList<>();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N=Integer.parseInt(br.readLine());
		door=new boolean[N+1];
		st=new StringTokenizer(br.readLine(), " ");
		door[Integer.parseInt(st.nextToken())]=true;
		door[Integer.parseInt(st.nextToken())]=true;
		
		mcnt=Integer.parseInt(br.readLine());
		for(int i=0; i<mcnt; i++)
			move.add(Integer.parseInt(br.readLine()));
		
		brute(0,0);
		
		System.out.println(res);
		br.close();
	}

	private static void brute(int idx, int cnt) {
		if(idx==mcnt) {
			res=Math.min(res, cnt);
			return;
		}
		
		if(door[move.get(idx)]) brute(idx+1, cnt);
		else {
			int now=move.get(idx);
			int moved=1;
			while(true) {
				if(now+moved>N) break;
				if(door[now+moved]) {
					door[now]=true;
					door[now+moved]=false;
					brute(idx+1, cnt+moved);
					door[now]=false;
					door[now+moved]=true;
					break;
				}
				moved++;
			}
			moved=1;
			while(true) {
				if(now-moved<=0) break;
				if(door[now-moved]) {
					door[now]=true;
					door[now-moved]=false;
					brute(idx+1, cnt+moved);
					door[now]=false;
					door[now-moved]=true;
					break;
				}
				moved++;
			}
		}
		
	}
	
}
