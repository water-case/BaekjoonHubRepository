import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N=Integer.parseInt(br.readLine());
		int M=Integer.parseInt(br.readLine());
		
		boolean[] broken=new boolean[10];
		
		if(M!=0) {
			st=new StringTokenizer(br.readLine()," ");
			for(int i=0; i<M; i++) {
				broken[Integer.parseInt(st.nextToken())]=true;
			}
		}
		
		int res=Math.abs(N-100);
		for(int i=0; i<=999_999; i++) {
			String str=String.valueOf(i);
			int len=str.length();
			
			boolean isBroken=false;
			for(int j=0; j<len; j++) {
				if(broken[str.charAt(j)-'0']) {
					isBroken=true;
					break;
				}
			}
			
			if(!isBroken) {
				int min=Math.abs(N-i)+len;
				res=Math.min(res, min);
			}
		}
		System.out.println(res);
		br.close();
	}
	
}
