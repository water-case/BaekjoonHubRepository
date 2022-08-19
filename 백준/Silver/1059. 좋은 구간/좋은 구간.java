import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int L=Integer.parseInt(br.readLine());
		
		ArrayList<Integer> S=new ArrayList<>();
		st=new StringTokenizer(br.readLine()," ");
		for(int i=0; i<L; i++)
			S.add(Integer.parseInt(st.nextToken()));
		
		int n=Integer.parseInt(br.readLine());
		
		Collections.sort(S);
		int res=0;
		int min=0, max=Integer.MAX_VALUE;
		for(int i=0; i<S.size(); i++) {
			int tn=S.get(i);
			
			if(n==tn) break;
			
			if(tn>n) {
				max=tn;
				if(i>0) min=S.get(i-1);
				res = brute(min,n,max);
				break;
			}
		}
		
		System.out.println(res);

		br.close();
	}

	static int brute(int min, int n, int max) {
		int cnt=0;
		
		for(int i=min+1; i<=n; i++) {
			for(int j=n; j<max; j++) {
				if(i==j) continue;
				cnt++;
			}
		}
		
		return cnt;
	}
	
}
