import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");

		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		HashSet<Integer> set=new HashSet<>();
		st=new StringTokenizer(br.readLine()," ");
		for(int i=0; i<N; i++) set.add(Integer.parseInt(st.nextToken()));
		
		int cnt=0;
		st=new StringTokenizer(br.readLine()," ");
		for(int i=0; i<M; i++) {
			if(set.contains(Integer.parseInt(st.nextToken())))
				cnt++;
		}
		
		System.out.println(N+M-cnt*2);
		
		br.close();
	}
	
}
