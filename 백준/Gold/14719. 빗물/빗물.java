import java.io.*;
import java.util.*;

public class Main {

	static int res=0;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int H=Integer.parseInt(st.nextToken());
		int W=Integer.parseInt(st.nextToken());
		
		boolean[][] map=new boolean[H][W];
		st=new StringTokenizer(br.readLine()," ");
		for(int i=0; i<W; i++) {
			int idx=Integer.parseInt(st.nextToken());
			for(int j=H-idx; j<H; j++) {
				map[j][i]=true;
			}
		}
		
		for(int i=0; i<H; i++) {
			int cnt=0;
			boolean chk=false;
			for(int j=0; j<W; j++) {
				if(map[i][j]) {
					if(chk) {
						res+=cnt;
						cnt=0;
					}
					chk=true;
				}
				if(chk && !map[i][j]) cnt++;
			}
		}
		
		System.out.println(res);
		br.close();
	}
	
}
