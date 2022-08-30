import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		ArrayList<Integer>[] avoid=new ArrayList[N+1];
		for(int i=0; i<=N; i++) avoid[i]=new ArrayList<>();
		for(int i=0; i<M; i++) {
			st=new StringTokenizer(br.readLine()," ");
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			avoid[a].add(b);
			avoid[b].add(a);
		}
		
		int cnt=0;
		for(int i=1; i<=N; i++) {
			for(int j=i+1; j<=N; j++) {
				if(avoid[i].contains(j)) continue;
				for(int k=j+1; k<=N; k++) {
					if(avoid[i].contains(k)||avoid[j].contains(k)) continue;
					cnt++;
				}
			}
		}

		System.out.println(cnt);
		br.close();
	}
	
}
