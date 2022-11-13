import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int[] cost=new int[3+1];
		for(int i=1; i<=3; i++) {
			cost[i]=Integer.parseInt(st.nextToken());
		}
		
		boolean[][] parking=new boolean[3][101];
		for(int i=0; i<3; i++) {
			st=new StringTokenizer(br.readLine()," ");
			int start=Integer.parseInt(st.nextToken());
			int end=Integer.parseInt(st.nextToken());
			
			for(int j=start; j<end; j++) {
				parking[i][j]=true;
			}
		}
		
		int res=0;
		for(int i=1; i<=100; i++) {
			int cnt=0;
			for(int j=0; j<3; j++) {
				if(parking[j][i]) cnt++;
			}
			res+=cost[cnt]*cnt;
		}
		
		System.out.println(res);
		br.close();
	}
	
}
