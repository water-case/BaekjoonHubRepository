import java.io.*;
import java.util.*;

public class Main {

	static int N, KIM, LIM, cnt=0, res=-1;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		N=Integer.parseInt(st.nextToken());
		KIM=Integer.parseInt(st.nextToken());
		LIM=Integer.parseInt(st.nextToken());

		brute();
		
		System.out.println(res);
		br.close();
	}

	static void brute() {
		cnt++;
		if((KIM+1)/2 == (LIM+1)/2) {
			res=cnt;
			return;
		}
		
		KIM=(KIM+1)/2;
		LIM=(LIM+1)/2;
		N/=2;
		if(N==0) return;
		brute();
	}
	
}
