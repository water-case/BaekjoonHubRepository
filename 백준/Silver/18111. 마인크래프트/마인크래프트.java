import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine(), " ");
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		int B=Integer.parseInt(st.nextToken());
		
		int[][] map=new int[N][M];
		for(int i=0; i<N; i++) {
			st=new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<M; j++) {
				map[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		int resT=Integer.MAX_VALUE;
		int resH=-1;
		for(int h=0; h<=256; h++) {
			int add=0;
			int rmv=0;
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<M; j++) {
					int diff=map[i][j]-h;
					if(diff > 0) rmv+=diff;
					else add-=diff;
				}
			}
			
			if(rmv+B >= add) {
				int time=rmv*2+add;
				if(resT>=time) {
					resT=time;
					resH=h;
				}
			}
		}
		
		System.out.println(resT+" "+resH);
		br.close();
	}
	
}
