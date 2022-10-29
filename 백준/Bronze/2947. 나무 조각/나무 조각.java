import java.io.*;
import java.util.*;

public class Main {

	static int[] stone=new int[5];
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		for(int i=0; i<5; i++) stone[i]=Integer.parseInt(st.nextToken());
		
		while(true) {
			int cnt=0;
			for(int i=0; i<5; i++) {
				if(stone[i]==i+1) cnt++;
			}
			if(cnt==5) break;
			
			int tmp=0;
			if(stone[0]>stone[1]) {
				swap(0,1);
				sb.append(stonePrint()).append("\n");
			}
			if(stone[1]>stone[2]) {
				swap(1,2);
				sb.append(stonePrint()).append("\n");
			}
			if(stone[2]>stone[3]) {
				swap(2,3);
				sb.append(stonePrint()).append("\n");
			}
			if(stone[3]>stone[4]) {
				swap(3,4);
				sb.append(stonePrint()).append("\n");
			}
		}

		System.out.println(sb.toString());
		br.close();
	}
	
	static String stonePrint() {
		String res="";
		for(int i=0; i<5; i++) res+=stone[i]+" ";
		return res;
	}
	
	static void swap(int idx1, int idx2) {
		int tmp=stone[idx1];
		stone[idx1]=stone[idx2];
		stone[idx2]=tmp;
		return;
	}
}
