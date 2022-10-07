import java.io.*;
import java.util.*;

public class Main {

	static ArrayList<Integer> plist=new ArrayList<>();
	static boolean[] prime = new boolean[1000];
	static int K;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		makePrime();
		
		int T=Integer.parseInt(br.readLine());
		for(int tc=0; tc<T; tc++) {
			K=Integer.parseInt(br.readLine());
			
			label:for(int i1:plist) {
				for(int i2:plist) {
					for(int i3:plist) {
						if(i1+i2+i3==K) {
							sb.append(i1).append(" ").append(i2).append(" ").append(i3).append("\n");
							break label;
						}
					}
				}
			}
		}
		
		System.out.println(sb.toString());
		br.close();
	}

	private static void makePrime() {
		Arrays.fill(prime, true);
		prime[0]=false;
		prime[1]=false;
		for(int i=2; i<1000; i++) {
			int num=i+i;
			while(num<1000) {
				prime[num]=false;
				num+=i;
			}
		}
		
		for(int i=2; i<1000; i++) {
			if(prime[i]) plist.add(i);
		}
	}
	
}
