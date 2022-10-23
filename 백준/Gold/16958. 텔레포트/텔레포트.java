import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int N=Integer.parseInt(st.nextToken());
		int T=Integer.parseInt(st.nextToken());
		
		int[][] map=new int[N+1][3];
		int[][] dist=new int[N+1][N+1];
		
		for(int i=1; i<=N; i++) {
			st=new StringTokenizer(br.readLine()," ");

			map[i][0]=Integer.parseInt(st.nextToken());
			map[i][1]=Integer.parseInt(st.nextToken());
			map[i][2]=Integer.parseInt(st.nextToken());
		}
		
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				if(i==j) continue;
				int cal=Math.abs(map[i][1]-map[j][1])+Math.abs(map[i][2]-map[j][2]);
				
				if(map[i][0]+map[j][0] == 2) cal=Math.min(T, cal);
				dist[i][j]=cal;
				dist[j][i]=cal;
			}
		}
		
		for(int k=1; k<=N; k++) {
			for(int i=1; i<=N; i++) {
				if(k==i) continue;
				for(int j=1; j<=N; j++) {
					if(j==i || j==k) continue;
					if(dist[i][j] > dist[i][k]+dist[k][j])
					   dist[i][j] = dist[i][k]+dist[k][j];
				}
			}
		}
		
		StringBuilder sb=new StringBuilder();
		int M=Integer.parseInt(br.readLine());
		for(int i=0; i<M; i++) {
			st=new StringTokenizer(br.readLine()," ");
			int A=Integer.parseInt(st.nextToken());
			int B=Integer.parseInt(st.nextToken());
			
			sb.append(dist[A][B]).append("\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
	
}
