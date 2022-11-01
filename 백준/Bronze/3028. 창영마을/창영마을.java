import java.io.*;
import java.util.*;

public class Main {

	static boolean[] cup;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		char[] mode=br.readLine().toCharArray();
		cup=new boolean[3];
		cup[0]=true;

		boolean tmp=false;
		for(int i=0; i<mode.length; i++) {
			     if(mode[i]=='A') swap(0,1);
			else if(mode[i]=='B') swap(1,2);
			else                  swap(0,2);
		}
		
		for(int i=0; i<3; i++) {
			if(cup[i]) System.out.println(i+1);
		}
		br.close();
	}
	
	private static void swap(int i, int j) {
		boolean tmp=cup[i];
		cup[i]=cup[j];
		cup[j]=tmp;
	}
	
}
