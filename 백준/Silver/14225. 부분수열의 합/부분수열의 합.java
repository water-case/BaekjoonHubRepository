import java.io.*;
import java.util.*;

public class Main {

	static int N;
	static int[] arr;
	static HashSet<Integer> set=new HashSet<>();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N=Integer.parseInt(br.readLine());
		
		arr=new int[N];
		st=new StringTokenizer(br.readLine()," ");
		for(int i=0; i<N; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		Comb(0,0);
		
		for(int i=1; i<=2_000_000; i++) {
			if(!set.contains(i)) {
				System.out.println(i);
				break;
			}
		}
				
		br.close();
	}
	
	static void Comb(int cnt, int num) {
		if(cnt==N) {
			set.add(num);
			return;
		}
		
		Comb(cnt+1, num);
		Comb(cnt+1, num+arr[cnt]);
	}
	
}
