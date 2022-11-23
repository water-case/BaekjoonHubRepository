import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");

		int AAT=Integer.parseInt(st.nextToken());
		int AHP=Integer.parseInt(st.nextToken());
		
		st=new StringTokenizer(br.readLine()," ");
		int BAT=Integer.parseInt(st.nextToken());
		int BHP=Integer.parseInt(st.nextToken());
		
		String res="";
		while(true) {
			     if(AHP<=0&&BHP<=0) res="DRAW";
			else if(AHP<=0)         res="PLAYER B";
			else if(BHP<=0)         res="PLAYER A";
			if(AHP<=0||BHP<=0) break;
			
			AHP-=BAT;
			BHP-=AAT;
		}
		
		System.out.println(res);
		br.close();
	}
	
}
