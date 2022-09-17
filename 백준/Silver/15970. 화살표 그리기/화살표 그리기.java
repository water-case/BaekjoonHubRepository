import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N=Integer.parseInt(br.readLine());
		
		ArrayList<Integer>[] color=new ArrayList[N+1];
		for(int i=1; i<=N; i++) color[i]=new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			st=new StringTokenizer(br.readLine()," ");
			int p=Integer.parseInt(st.nextToken());
			int c=Integer.parseInt(st.nextToken());
			
			color[c].add(p);
		}
		
		int res=0;
		for(int i=1; i<=N; i++) {
			color[i].sort((o1,o2)->{return Integer.compare(o1, o2);});
			
			for(int j=0; j<color[i].size(); j++) {
				int tmp=Integer.MAX_VALUE;
				if(j-1>=0)
					tmp=Math.min(tmp, color[i].get(j)-color[i].get(j-1));
				if(j+1<color[i].size())
					tmp=Math.min(tmp, color[i].get(j+1)-color[i].get(j));
				res+=tmp;
			}
		}
		
		System.out.println(res);
		br.close();
	}
	
}
