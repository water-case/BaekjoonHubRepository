import java.io.*;
import java.util.*;

public class Main {

	static LinkedList<String> res=new LinkedList<>();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		perm(0,new boolean[10],"");
		
		int N=Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			st=new StringTokenizer(br.readLine()," ");
			String num=st.nextToken();
			int strike=Integer.parseInt(st.nextToken());
			int ball=Integer.parseInt(st.nextToken());
			
			baseball(num,strike,ball);
		}
		
		System.out.println(res.size());
		br.close();
	}

	static void baseball(String num, int strike, int ball) {
		for(int i=0; i<res.size(); i++) {
			int ts=0, tb=0;
			String s=res.get(i);
			for(int j=0; j<3; j++) {
				if(s.charAt(j)==num.charAt(j)) {
					ts++;
				} else if(s.charAt(j)==num.charAt((j+1)%3)||s.charAt(j)==num.charAt((j+2)%3)) {
					tb++;
				}
			}
			if(strike!=ts||ball!=tb) {
				res.remove(s);
				i--;
			}
		}
	}

	static void perm(int cnt, boolean[] v, String s) {
		if(cnt==3) {
			res.add(s);
			return;
		}
		
		for(int i=1; i<=9; i++) {
			if(v[i]) continue;
			v[i]=true;
			perm(cnt+1, v, s+i);
			v[i]=false;
		}
	}
	
}
