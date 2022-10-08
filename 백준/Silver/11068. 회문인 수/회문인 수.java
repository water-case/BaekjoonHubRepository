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
				
				ArrayList<Integer> rnums=(ArrayList<Integer>) nums.clone();
				Collections.reverse(rnums);
				
				for(int j=0; j<nums.size(); j++) {
					if(nums.get(j)!=rnums.get(j)) {
						continue label;
					}
				}
				chk=true;
				break;
			}
			
			if(chk) sb.append(1);
			else sb.append(0);
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
	
}
