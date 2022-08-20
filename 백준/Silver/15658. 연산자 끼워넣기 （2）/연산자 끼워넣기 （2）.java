import java.io.*;
import java.util.*;

public class Main {

	static int N, max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
	static int[] arr;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N=Integer.parseInt(br.readLine());
		arr=new int[N];
		st=new StringTokenizer(br.readLine()," ");
		for(int i=0; i<N; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		int[] cal=new int[4];
		st=new StringTokenizer(br.readLine()," ");
		for(int i=0; i<4; i++) {
			cal[i]=Integer.parseInt(st.nextToken());
		}
		
		brute(arr[0],1,cal);
		
		System.out.println(max);
		System.out.println(min);
		br.close();
	}

	private static void brute(int num, int cnt, int[] cal) {
		if(cnt==N) {
			if(num>max) max=num;
			if(num<min) min=num;
			return;
		}
		
		for(int i=0; i<4; i++) {
			if(cal[i]<=0) continue;
			
			cal[i]--;
			if(i==0) 
				brute(num+arr[cnt], cnt+1, cal);
			else if(i==1) 
				brute(num-arr[cnt], cnt+1, cal);
			else if(i==2) 
				brute(num*arr[cnt], cnt+1, cal);
			else 
				brute(num/arr[cnt], cnt+1, cal);
			cal[i]++;
		}
	}
	
}
