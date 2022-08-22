import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int D=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		
		int[] A=new int[D+1];
		int[] B=new int[D+1];
		A[1]=1; A[2]=0; B[1]=0; B[2]=1;
		for(int i=3; i<=D; i++) {
			A[i]=A[i-1]+A[i-2];
			B[i]=B[i-1]+B[i-2];
		}
		
		label:for(int i=1; i<=K; i++) {
			for(int j=1; j<=K; j++) {
				if(A[D]*i+B[D]*j==K) {
					System.out.println(i);
					System.out.println(j);
					break label;
				}
			}
		}

		br.close();
	}
	
}
