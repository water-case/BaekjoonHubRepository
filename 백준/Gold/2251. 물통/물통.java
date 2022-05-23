import java.io.*;
import java.util.*;

public class Main {

	static int[] size;
	static boolean[][] v;
	static ArrayList<Integer> ans=new ArrayList<>();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		size=new int[3];
		for(int i=0; i<3; i++) size[i]=Integer.parseInt(st.nextToken());
		v=new boolean[201][201];
		
		dfs(0, 0, size[2]);
		Collections.sort(ans);
		StringBuilder sb=new StringBuilder();
		for(int i:ans) sb.append(i).append(" ");
		System.out.println(sb.toString());
		br.close();
	}
	
	static void dfs(int a, int b, int c) {
		if(v[a][b]) return ;
		if(a==0) ans.add(c);
		v[a][b]=true;
		
		// 0 -> 1
		if(a+b > size[1]) dfs(a+b-size[1], size[1], c);
		else dfs(0, a+b , c);
		
		// 0 -> 2 2번 통의 물만 주이지므로 2번보다 물이 많은 경우는 없음
		dfs(a, 0, b+c);
		
		// 1 -> 0
		if(a+b > size[0]) dfs(size[0], a+b-size[0], c);
		else dfs(a+b, 0 , c);
		
		// 1 -> 2
		dfs(0, b, a+c);
		
		// 2 -> 0
		if(a+c > size[0]) dfs(size[0], b, a+c-size[0]);
		else dfs(a+c, b, 0);
		
		// 2 -> 1
		if(b+c > size[1]) dfs(a, size[1], a+b-size[1]);
		else dfs(a, b+c, 0);
		
	}
	
}
