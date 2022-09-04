import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		StringBuilder sb=new StringBuilder();
		for(int i=1000; i<=9999; i++) {
			int sum10=0, sum12=0, sum16=0;
			
			for(int n=i; n>0; n/=10) {
				sum10+=n%10;
			}
			for(int n=i; n>0; n/=12) {
				sum12+=n%12;
			}
			for(int n=i; n>0; n/=16) {
				sum16+=n%16;
			}
			
			if(sum10==sum12 && sum12==sum16)
				sb.append(i).append("\n");
		}
		System.out.println(sb.toString());
	}
	
}
