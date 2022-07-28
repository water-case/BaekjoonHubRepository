import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		int F=Integer.parseInt(br.readLine());
		
		int tmp=N%100;
		N-=tmp;
		
		label:for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				if(N%F==0) {
					System.out.println(i+""+j);
					break label;
				}
				N++;
			}
		}

		br.close();
	}
	
}
