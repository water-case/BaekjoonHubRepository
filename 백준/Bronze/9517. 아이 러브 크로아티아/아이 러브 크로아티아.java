import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int time=210;
		
		int K=Integer.parseInt(br.readLine());
		int N=Integer.parseInt(br.readLine());
		for(int i=0; i<N; i++) {
			st=new StringTokenizer(br.readLine()," ");
			
			int T=Integer.parseInt(st.nextToken());
			String Z=st.nextToken();
			
			if(time<T) {
				System.out.println(K);
				break;
			}
			
			if("T".equals(Z)) {
				K=K%8+1;
				time-=T;
			} else {
				time-=T;
			}
		}
		
		br.close();
	}
	
}
