import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int H=Integer.parseInt(st.nextToken());
		int W=Integer.parseInt(st.nextToken());
		char[][] map=new char[H][W];
		
		for(int i=0; i<H; i++) map[i]=br.readLine().toCharArray();
		
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<H; i++) {
			int t=-1;
			for(int j=0; j<W; j++) {
				if(map[i][j]=='c') {
					t=0;
					sb.append(t).append(" ");
					t++;
				} else {
					sb.append(t).append(" ");
					if(t!=-1) t++;
				}
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
	
}
