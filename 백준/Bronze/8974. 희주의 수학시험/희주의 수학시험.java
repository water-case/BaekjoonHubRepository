import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		ArrayList<Integer> nums=new ArrayList<>();
		for(int i=1; i<1000; i++) {
			for(int j=0; j<i; j++) {
				nums.add(i);
			}
		}
		
		int A=Integer.parseInt(st.nextToken());
		int B=Integer.parseInt(st.nextToken());
		
		int res=0;
		for(int i=A-1; i<B; i++) {
			res+=nums.get(i);
		}
		
		System.out.println(res);
		br.close();
	}
	
}
