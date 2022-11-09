import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int c1=Integer.parseInt(br.readLine());
		
		System.out.println(seq(c1, 1));

		br.close();
	}

	private static int seq(int c1, int idx) {
		if(c1==1) {
			return idx;
		}
		
		if(c1%2==0) {
			return seq(c1/2, idx+1);
		} else {
			return seq(3*c1+1, idx+1);
		}
	}
	
}
