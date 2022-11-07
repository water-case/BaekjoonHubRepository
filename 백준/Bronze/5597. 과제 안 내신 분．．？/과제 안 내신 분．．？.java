import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		boolean[] students=new boolean[31];
		for(int i=0; i<28; i++) {
			int idx=Integer.parseInt(br.readLine());
			students[idx]=true;
		}
		
		for(int i=1; i<=30; i++) {
			if(!students[i]) System.out.println(i);
		}
		
		br.close();
	}
	
}
