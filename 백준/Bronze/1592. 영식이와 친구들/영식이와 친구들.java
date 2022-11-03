import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		int L=Integer.parseInt(st.nextToken());
		
		int[] pos=new int[N+1];
		int idx=1;
		int res=0;
		label:while(true) {
			pos[idx]++;
			for(int i=1; i<=N; i++) if(pos[i]==M) break label;
			res++;
			
			if(pos[idx]%2==0) {
				idx=(idx+N-L)%N;
			} else {
				idx=(idx+L)%N;
			}
		}

		System.out.println(res);
		br.close();
	}
	
}
