import java.io.*;
import java.util.*;

public class Main {

	static boolean[] isPrime=new boolean[10000];
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		StringTokenizer st;
		
		makePrime(); // 소수만들기
		
		int T=Integer.parseInt(br.readLine());
		for(int tc=1; tc<=T; tc++) {
			st=new StringTokenizer(br.readLine(), " ");
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			
			int ans=bfs(a,b);
			
			if(ans==Integer.MAX_VALUE) sb.append("Impossible").append("\n");
			else 	   				   sb.append(ans).append("\n");
		}
		System.out.println(sb.toString());
		br.close();
	}
	
	static int bfs(int start, int end) {
		int result=Integer.MAX_VALUE;
		
		boolean[] v=new boolean[10000];
		ArrayDeque<int[]> q=new ArrayDeque<>();
		q.offer(new int[] {start, 0});

		while(!q.isEmpty()) {
			int[] now=q.poll();
			
			if(now[0]==end) return now[1];
			if(now[0]<1000 || now[0]>=10000 || v[now[0]] || !isPrime[now[0]]) continue;
			v[now[0]]=true;
			
			for(int i=0; i<=9; i++) {
				int cal=1000*i + now[0]%1000;
				if(cal>=1000 && cal<10000 && !v[cal] && isPrime[cal])
					q.offer(new int[] {cal, now[1]+1});
				
				cal=now[0]/1000*1000 + 100*i + now[0]%100;
				if(cal>=1000 && cal<10000 && !v[cal] && isPrime[cal])
					q.offer(new int[] {cal, now[1]+1});
				
				cal=now[0]/100*100+10*i+now[0]%10;
				if(cal>=1000 && cal<10000 && !v[cal] && isPrime[cal])
					q.offer(new int[] {cal, now[1]+1});
				
				cal=now[0]/10*10+i;
				if(cal>=1000 && cal<10000 && !v[cal] && isPrime[cal])
					q.offer(new int[] {cal, now[1]+1});
			}
		}
		
		return result;
	}
	
	static void makePrime() {
		Arrays.fill(isPrime, true);
		for(int i=2; i<10000; i++) {
			if(isPrime[i]==true) {
				int n=i;
				while(true) {
					n+=i;
					if(n>=10000) break;
					isPrime[n]=false;
				}
			}
		}
	}

}
