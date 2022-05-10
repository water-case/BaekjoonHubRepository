import java.io.*;
import java.util.*;

public class Main {

	static int[] std;
	static int n, cnt;
	static boolean[] v;
	static boolean[] cycle;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		StringTokenizer st;

		int T=Integer.parseInt(br.readLine());
		for(int tc=1; tc<=T; tc++) {
			n=Integer.parseInt(br.readLine());
			std=new int[n];
			st=new StringTokenizer(br.readLine()," ");
			for(int i=0; i<n; i++) std[i]=Integer.parseInt(st.nextToken())-1;
			
			v=new boolean[n];
			cycle=new boolean[n];
			cnt=0;
			
			for(int i=0; i<n; i++)
				dfs(i);
			
			sb.append(n-cnt).append("\n");
		}
		System.out.println(sb.toString());
		br.close();
	}

	static void dfs(int now) {
		if(v[now]) return;
		v[now]=true;
		int next=std[now];
		
		if(!v[next]) dfs(next);
		else if(!cycle[next]) {
			cnt++;
			for(int i=next; i!=now; i=std[i])
				cnt++;
		}
		cycle[now]=true;
	}
	
}
