import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int N=Integer.parseInt(st.nextToken());
		int L=Integer.parseInt(st.nextToken());
		int D=Integer.parseInt(st.nextToken());
		
		int res=0;
		boolean[] time=new boolean[N*L+(N-1)*5];
		for(int i=0; i<N; i++) {
			int t=(L+5)*i;
			
			for(int j=t; j<t+L; j++)
				time[j]=true;
		}
		
		while(res<time.length) {
			if(!time[res]) break;
			
			res+=D;
		}
		
		System.out.println(res);
		br.close();
	}
	
}
