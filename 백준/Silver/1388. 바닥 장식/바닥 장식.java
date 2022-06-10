import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		char[][] map=new char[N][M];
		
		for(int i=0; i<N; i++) {
			st=new StringTokenizer(br.readLine()," ");
			map[i]=st.nextToken().toCharArray();
		}
		
		int ans=0;
		
		ArrayDeque<int[]> q=new ArrayDeque<>();
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(map[i][j]=='-') {
					map[i][j]=0;
					ans++;
					q.offer(new int[] {i,j});
					while(!q.isEmpty()) {
						int[] now=q.poll();
						
						if(now[1]+1<M && map[now[0]][now[1]+1]=='-') {
							map[now[0]][now[1]+1]=0;
							q.offer(new int[] {now[0],now[1]+1});
						}
					}
				}
				else if(map[i][j]=='|') {
					map[i][j]=0;
					ans++;
					q.offer(new int[] {i,j});
					while(!q.isEmpty()) {
						int[] now=q.poll();
						
						if(now[0]+1<N && map[now[0]+1][now[1]]=='|') {
							map[now[0]+1][now[1]]=0;
							q.offer(new int[] {now[0]+1,now[1]});
						}
					}
				}
			}
		}
		
		System.out.println(ans);
		br.close();
	}
	
}
