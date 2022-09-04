import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		StringBuilder sb=new StringBuilder();
		for(int i=2992; i<=9999; i++) {
			int sum10=dedup(i,10);
			int sum12=dedup(i,12);
			int sum16=dedup(i,16);
			
			if(sum10==sum12 && sum12==sum16)
				sb.append(i).append("\n");
		}
		System.out.println(sb.toString());
	}
	
	static int dedup(int num, int decimal) {
		int res=0;
		for(int n=num; n>0; n/=decimal) {
			res+=n%decimal;
		}
		return res;
	}
	
}
