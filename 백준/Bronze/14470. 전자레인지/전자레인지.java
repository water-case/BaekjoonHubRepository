import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int A=Integer.parseInt(br.readLine());
		int B=Integer.parseInt(br.readLine());
		int C=Integer.parseInt(br.readLine());
		int D=Integer.parseInt(br.readLine());
		int E=Integer.parseInt(br.readLine());
		
		int res=0;
		if(A<0) res+=(-1*A)*C;
		if(A<=0) res+=D;
		
		if(A<0) res+=B*E;
		else res+=(B-A)*E;

		System.out.println(res);
		br.close();
	}
	
}
