import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		
		List<Integer> nums=new ArrayList<>();
		st=new StringTokenizer(br.readLine()," ");
		for(int i=0; i<N; i++) {
			nums.add(Integer.parseInt(st.nextToken()));
		}
		
		List<Integer> list=new ArrayList<>();
		for(int i=0; i<=N-K; i++) {
			int n=0;
			for(int j=i; j<i+K; j++) {
				n+=nums.get(j);
			}
			list.add(n);
		}
		
		int res=list.stream().sorted().max(Integer::compare).orElse(0);
		System.out.println(res);
		br.close();
	}
	
}
