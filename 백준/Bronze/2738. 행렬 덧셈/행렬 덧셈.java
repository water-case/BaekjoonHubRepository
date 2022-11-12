import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		int[][] mat=new int[N][M];
		for(int i=0; i<N; i++) {
			st=new StringTokenizer(br.readLine()," ");
			for(int j=0; j<M; j++) mat[i][j]=Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<N; i++) {
			st=new StringTokenizer(br.readLine()," ");
			for(int j=0; j<M; j++) {
				int b=Integer.parseInt(st.nextToken());
				mat[i][j]+=b;
			}
		}
		
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				sb.append(mat[i][j]).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
		br.close();
	}
	
}
