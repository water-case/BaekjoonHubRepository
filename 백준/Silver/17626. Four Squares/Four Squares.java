import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int N=Integer.parseInt(br.readLine());
		
		int i=0,j=0,k=0,l=0;
		label:for(i=0; i<=Math.sqrt(N); i++) {
			for(j=i; j<=Math.sqrt(N); j++) {
				for(k=j; k<=Math.sqrt(N); k++) {
					for(l=k; l<=Math.sqrt(N); l++) {
						if(i*i+j*j+k*k+l*l==N) {
							break label;
						}
					}
				}
			}
		}
		int cnt=0;
		if(i!=0) cnt++;
		if(j!=0) cnt++;
		if(k!=0) cnt++;
		if(l!=0) cnt++;
		System.out.println(cnt);
		br.close();
	}
	
}
