import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] nums=new int[5];
		for(int i=0; i<5; i++) {
			nums[i]=Integer.parseInt(st.nextToken());
		}
		
		int num=4;
		while(true) {
			int cnt=0;
			
			for(int i=0; i<5; i++) {
				if(num%nums[i]==0) {
					cnt++;
				}
			}
			
			if(cnt>=3) {
				break;
			}
			num++;
		}
		
		System.out.println(num);
		br.close();
	}
	
}
