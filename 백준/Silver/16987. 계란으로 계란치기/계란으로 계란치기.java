import java.io.*;
import java.util.*;

public class Main {

	static class Egg {
		int weight, hp;
	}
	
	static int N, res=0;
	static ArrayList<Egg> eggs=new ArrayList<>();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		N=Integer.parseInt(br.readLine());
		
		eggs=new ArrayList<>();
		for(int i=0; i<N; i++) {
			st=new StringTokenizer(br.readLine()," ");
			
			Egg egg=new Egg();
			egg.hp=Integer.parseInt(st.nextToken());
			egg.weight=Integer.parseInt(st.nextToken());
			eggs.add(egg);
		}
		
		brute(0,0);
		System.out.println(res);
		br.close();
	}

	private static void brute(int idx, int cnt) {
		if(idx==N) {
			res=Math.max(res, cnt);
			return;
		}
		
		Egg egg1=eggs.get(idx);
		if(egg1.hp<=0) {
			brute(idx+1, cnt);
			return;
		}

		int bcnt=0;
		for(int i=0; i<N; i++) {
			if(idx==i) continue;
			
			Egg egg2=eggs.get(i);
			if(egg2.hp<=0) {
				bcnt++;
				continue;
			}
			
			int ecnt=0;
			egg1.hp-=egg2.weight;
			egg2.hp-=egg1.weight;
			
			if(egg1.hp<=0) ecnt++;
			if(egg2.hp<=0) ecnt++;
			brute(idx+1, cnt+ecnt);
			
			egg1.hp+=egg2.weight;
			egg2.hp+=egg1.weight;
		}
		if(bcnt==N-1) brute(idx+1, cnt);
	}
	
}
