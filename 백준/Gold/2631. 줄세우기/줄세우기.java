import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		int[] arr=new int[N];
		for(int i=0; i<N; i++) arr[i]=Integer.parseInt(br.readLine());
		
		int[] memo=new int[N];
		
		for(int i=0; i<N; i++) {
			memo[i]=1;
			for(int j=0; j<i; j++)
				if(arr[j]<arr[i] && memo[i]<memo[j]+1)
					memo[i]=memo[j]+1;
		}
		
		int max=-1;
		for(int i=0; i<N; i++) max=Math.max(max, memo[i]);
		
		System.out.println(N-max);
		br.close();
	}
	
}
