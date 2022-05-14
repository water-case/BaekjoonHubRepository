import java.io.*;
import java.util.*;

public class Main {

	static final int mod=1000;

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");

		int a=Integer.parseInt(st.nextToken()); // 성체가 되기까지 걸리는 날짜
		int b=Integer.parseInt(st.nextToken()); // 더이상 개체를 만들지 않는 날짜
		int d=Integer.parseInt(st.nextToken()); // 태어난 후 죽는 날짜
		int N=Integer.parseInt(st.nextToken()); // N일째 되는날
		
		int[] bug=new int[N+1]; // d일차에 짚신벌레 마릿수
		Arrays.fill(bug, 0, a, 1); // 최초 한마리 성체될떄까지 1마리유지
		for(int i=a; i<=N; i++) {
			bug[i]=(bug[i-1]+bug[i-a])%mod; // 오늘개체수 = 전날 + a전날 개체수
			if(b<=i)
				bug[i]=(bug[i]-bug[i-b]+mod)%mod; // b일이 지나면 개체못만드므로 b일 이전의 개체수만큼 뺌
		}
		
		int ans=bug[N]; // N일차때의 개체수
		if(N>=d) ans=(ans-bug[N-d]+mod)%mod; // d일 이전의 개체수들은 다죽은애들
		System.out.println(ans);
		
		br.close();
	}
	
}
