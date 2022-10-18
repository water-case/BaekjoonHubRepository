import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int[] num=new int[4];
		for(int i=0; i<4; i++) num[i]=Integer.parseInt(st.nextToken());
		
		int crossN=getMinNum(num);
		
		boolean[] clockNum=getClockNum();
		
		int res=0;
		for(int i=1111; i<=crossN; i++) {
			if(clockNum[i]) res++;
		}
		
		System.out.println(res);
		br.close();
	}

	private static boolean[] getClockNum() {
		boolean[] v=new boolean[10000];
		
		int[] n=new int[4];
		for(int i=1; i<10; i++) {
			n[0]=i;
			for(int j=1; j<10; j++) {
				n[1]=j;
				for(int k=1; k<10; k++) {
					n[2]=k;
					for(int l=1; l<10; l++) {
						n[3]=l;
						int num=getMinNum(n);
						
						if(!v[num]) v[num]=true;
					}
				}
			}
		}
		
		return v;
	}

	private static int getMinNum(int[] num) {
		int min=9999;
		
		for(int i=0; i<4; i++) {
			int n=num[i];
			for(int j=1; j<4; j++) {
				n*=10;
				n+=num[(i+j)%4];
			}
			min=Math.min(min, n);
		}
		
		return min;
	}
	
}
