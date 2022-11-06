import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int T=Integer.parseInt(br.readLine());
		int res1=0, res2=0, res3=0;
		res1=T/300;
		T%=300;
		res2=T/60;
		T%=60;
		res3=T/10;
		T%=10;
		
		if(T!=0) {
			System.out.println(-1);
		} else {
			System.out.println(res1 + " " + res2 + " " + res3);
		}

		br.close();
	}
	
}
