import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");

		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		
		int num=0;
		int res=0;
		for(int i=1; i<=K; i++) {
			num+=N;
			int tnum=num;
			int tmp=0;
			while(tnum!=0) {
				tmp*=10;
				tmp+=tnum%10;
				tnum/=10;
			}
			res=Math.max(res, tmp);
		}
		
		System.out.println(res);
		br.close();
	}
}
