import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		char[][] map=new char[N][N];
		
		for(int i=0; i<N; i++) {
			map[i]=br.readLine().toCharArray();
		}
		char[][] cmap=new char[N][N];
		for(int i=0; i<N; i++) {
			cmap[i]=map[i].clone();
		}
		
		for(int k=0; k<N; k++) {
			for(int i=0; i<N; i++) {
				if(k==i) continue;
				for(int j=0; j<N; j++) {
					if(i==j || k==j) continue;
					if(map[i][j]=='Y') continue;
					if(map[i][k]=='Y' && map[k][j]=='Y')
						cmap[i][j]='Y';
				}
			}
		}
		
		int max=0;
		for(int i=0; i<N; i++) {
			int cnt=0;
			for(int j=0; j<N; j++) {
				if(cmap[i][j]=='Y') cnt++;
			}
			max=Math.max(max, cnt);
		}
		System.out.println(max);
		br.close();
	}

}
