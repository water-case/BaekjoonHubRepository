import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		StringTokenizer st;
		
		int n=Integer.parseInt(br.readLine());
		
		int min=Integer.MAX_VALUE;
		int[] arr=new int[n];
		st=new StringTokenizer(br.readLine()," ");
		for(int i=0; i<n; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			if(min>arr[i]) min=arr[i];
		}
		
		for(int i=1; i<=min; i++) {
			int cnt=0;
			
			for(int j=0; j<n; j++) {
				if(arr[j]%i == 0) {
					cnt++;
				}
			}
			
			if(cnt==n)
				sb.append(i).append("\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
	
}
