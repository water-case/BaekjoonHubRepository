import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();

		int T=Integer.parseInt(br.readLine());
		while(T-->0) {
			int B=Integer.parseInt(br.readLine());
			
			boolean chk=false;
			label: for(int i=2; i<=64; i++) {
				ArrayList<Integer> nums=new ArrayList<>();
				
				int num=B;
				while(num>0) {
					nums.add(num%i);
					num/=i;
				}
				
				int size=nums.size();
				for(int j=0; j<size/2; j++) {
					if(nums.get(j)!=nums.get(size-j-1)) {
						continue label;
					}
				}
				chk=true;
				break;
			}
			
			sb.append(chk ? "1\n" : "0\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
	
}
