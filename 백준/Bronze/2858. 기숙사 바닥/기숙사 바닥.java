import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int R=Integer.parseInt(st.nextToken());
		int B=Integer.parseInt(st.nextToken());
		
		int sum=R+B;
		int sqrt=(int)Math.sqrt(sum);
		
		for(int i=3; i<=sqrt; i++) {
			int j=sum/i;
			if(j<3) continue;
			
			int brown=(j-2)*(i-2);
			int red=i*j-brown;
			
			if(red==R && brown==B) {
				if(i>j) System.out.println(i+" "+j);
				else System.out.println(j+" "+i);
			}
		}

		br.close();
	}
	
}
