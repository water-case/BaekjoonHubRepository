import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int[] cup=new int[4];
		cup[0]=1;
		cup[3]=2;
		
		char[] pos=br.readLine().toCharArray();
		
		for(int i=0; i<pos.length; i++) {
			int n=pos[i]-64;
			int tmp=0;
			if(n==1) {
				tmp=cup[0];
				cup[0]=cup[1];
				cup[1]=tmp;
			} else if(n==2) {
				tmp=cup[0];
				cup[0]=cup[2];
				cup[2]=tmp;
			} else if(n==3) {
				tmp=cup[0];
				cup[0]=cup[3];
				cup[3]=tmp;
			} else if(n==4) {
				tmp=cup[1];
				cup[1]=cup[2];
				cup[2]=tmp;
			} else if(n==5) {
				tmp=cup[1];
				cup[1]=cup[3];
				cup[3]=tmp;
			} else if(n==6) {
				tmp=cup[2];
				cup[2]=cup[3];
				cup[3]=tmp;
			}
		}
		
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<4; i++) {
			if(cup[i]==1) {
				sb.append(i+1).append("\n");
				break;
			}
		}
		for(int i=0; i<4; i++) {
			if(cup[i]==2) {
				sb.append(i+1).append("\n");
				break;
			}
		}

		System.out.println(sb.toString());
		br.close();
	}
	
}
