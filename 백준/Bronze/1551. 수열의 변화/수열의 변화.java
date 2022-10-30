import java.io.*;
import java.util.*;

public class Main {

	static int[] arr;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		
		st=new StringTokenizer(br.readLine(),",");
		arr=new int[N];
		for(int i=0; i<N; i++) arr[i]=Integer.parseInt(st.nextToken());
		
		while(K-->0) {
			Change();
		}
		
		StringBuilder sb=new StringBuilder();
		for(int i:arr) {
			sb.append(i).append(",");
		}
		sb=sb.delete(sb.length()-1, sb.length());
		System.out.println(sb.toString());
		br.close();
	}
	
	private static void Change() {
		int[] tmp=new int[arr.length-1];
		for(int i=0; i<arr.length-1; i++) {
			tmp[i]=arr[i+1]-arr[i];
		}
		arr=tmp;
	}
	
}
