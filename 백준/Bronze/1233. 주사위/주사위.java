import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int S1=Integer.parseInt(st.nextToken());
		int S2=Integer.parseInt(st.nextToken());
		int S3=Integer.parseInt(st.nextToken());
		
		int[] cnt=new int[S1+S2+S3+1];
		
		for(int i=1; i<=S1; i++) {
			for(int j=1; j<=S2; j++) {
				for(int k=1; k<=S3; k++) {
					cnt[i+j+k]++;
				}
			}
		}
		
		int max=Integer.MIN_VALUE, idx=-1;
		for(int i=1; i<=S1+S2+S3; i++) {
			if(cnt[i]>max) {
				max=cnt[i];
				idx=i;
			}
		}
		
		System.out.println(idx);
		br.close();
	}
	
}
