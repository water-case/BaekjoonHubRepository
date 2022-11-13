import java.io.*;
import java.util.*;

public class Main {

	static int cnt=0;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		System.out.println(1);
		System.out.println(0);
		br.close();
	}
	
	static public int MenOfPassion(int[] A, int n) {
		cnt++;
		int i=n/2;
		return A[i];
	}
	
}
