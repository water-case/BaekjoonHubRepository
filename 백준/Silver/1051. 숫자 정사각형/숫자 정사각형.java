import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int res=1;
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		char[][] map=new char[N][M];
		for(int i=0; i<N; i++) {
			map[i]=br.readLine().toCharArray();
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				for(int k=1; k<Math.min(N, M); k++) {
					if(i+k<N && j+k<M && map[i][j]==map[i+k][j] && map[i][j]==map[i+k][j+k] && map[i][j]==map[i][j+k]) {
						res=Math.max(res, k+1);
					}
				}
			}
		}
		
		System.out.println(res*res);
		br.close();
	}
	
}
