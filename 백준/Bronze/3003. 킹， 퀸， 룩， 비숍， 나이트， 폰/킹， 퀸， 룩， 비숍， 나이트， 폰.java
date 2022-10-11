import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int[] chess_origin= {1,1,2,2,2,8};
		
		int[] chess_now=new int[6];
		for(int i=0; i<6; i++) chess_now[i]=Integer.parseInt(st.nextToken());
		
		for(int i=0; i<6; i++) sb.append(chess_origin[i]-chess_now[i]).append(" ");

		System.out.println(sb.toString());
		br.close();
	}
	
}
