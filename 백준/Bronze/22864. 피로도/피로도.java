import java.io.*;
import java.util.*;

public class Main {
	
	static int A,B,C,M,res=0;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		A=Integer.parseInt(st.nextToken());
		B=Integer.parseInt(st.nextToken());
		C=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		brute(0,0,0);
		
		System.out.println(res);
		br.close();
	}

	private static void brute(int nowM, int work, int time) {
		if(nowM>M) return;
		if(time==24) {
			res=Math.max(res, work);
			return;
		}
		
		if(nowM+A<=M) {
			brute(nowM+A, work+B, time+1);
		} else {
			brute(Math.max(0, nowM-C), work, time+1);
		}
	}
	
}
