import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		boolean[] cup=new boolean[4];
		cup[1]=true;
		int M=Integer.parseInt(br.readLine());
		while(M-->0) {
			st=new StringTokenizer(br.readLine(), " ");
			int X=Integer.parseInt(st.nextToken());
			int Y=Integer.parseInt(st.nextToken());
			
			boolean tmp=cup[X];
			cup[X]=cup[Y];
			cup[Y]=tmp;
		}
		
		int res=-1;
		for(int i=1; i<=3; i++) if(cup[i]) res=i;
		System.out.println(res);
		br.close();
	}
	
}
