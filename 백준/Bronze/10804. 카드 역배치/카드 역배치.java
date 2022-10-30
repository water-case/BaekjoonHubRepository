import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		ArrayList<Integer> nums=new ArrayList<>();
		for(int i=1; i<=20; i++) nums.add(i);
		
		for(int i=0; i<10; i++) {
			st=new StringTokenizer(br.readLine()," ");
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			
			List<Integer> sub=nums.subList(a-1, b);
			Collections.reverse(sub);
			ArrayList<Integer> rnums=new ArrayList<>();
			for(Integer ii:sub) rnums.add(ii);
			
			for(int j=0; j<b-a; j++) {
				nums.set(a+j-1, rnums.get(j));
			}
		}
		
		StringBuilder sb=new StringBuilder();
		for(int i:nums)
			sb.append(i).append(" ");
		System.out.println(sb.toString());
		br.close();
	}
	
}
