import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		int[][] picture=new int[100][100];
		
		while(N-->0) {
			st=new StringTokenizer(br.readLine()," ");
			int x1=Integer.parseInt(st.nextToken())-1;
			int y1=Integer.parseInt(st.nextToken())-1;
			int x2=Integer.parseInt(st.nextToken())-1;
			int y2=Integer.parseInt(st.nextToken())-1;
			
			for(int i=x1; i<=x2; i++) {
				for(int j=y1; j<=y2; j++) {
					picture[i][j]++;
				}
			}
		}
		
		int res=0;
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				if(picture[i][j]>M) res++;
			}
		}
		
		System.out.println(res);
		br.close();
	}
	
}
