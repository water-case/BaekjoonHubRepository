import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		int[][] cnt=new int[M][4];
		for(int i=0; i<N; i++) {
			char[] sc=br.readLine().toCharArray();
			
			for(int j=0; j<M; j++) {
				if(sc[j]=='A') cnt[j][0]++;
				else if(sc[j]=='C') cnt[j][1]++;
				else if(sc[j]=='G') cnt[j][2]++;
				else if(sc[j]=='T') cnt[j][3]++;
			}
		}
		
		String s="";
		int res=0;
		for(int i=0; i<M; i++) {
			int max=0;
			int idx=-1;
			for(int j=0; j<4; j++) {
				if(cnt[i][j]>max) {
					max=cnt[i][j];
					idx=j;
				}
			}
			res+=N-max;
			if(idx==0) s+="A";
			else if(idx==1) s+="C";
			else if(idx==2) s+="G";
			else if(idx==3) s+="T";
		}

		System.out.println(s);
		System.out.println(res);
		br.close();
	}
	
}
