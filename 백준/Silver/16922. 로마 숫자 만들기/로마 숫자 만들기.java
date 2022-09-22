import java.io.*;
import java.util.*;

public class Main {

	static int[] nums= {1,5,10,50};
	static int N;
	static HashSet<Integer> set=new HashSet<>();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		N=Integer.parseInt(br.readLine());
		
		for(int i=0; i<4; i++) set.add(nums[i]);
		for(int i=1; i<N; i++) {
			HashSet<Integer> set2=new HashSet<>();
			for(Integer num:set) {
				for(int j=0; j<4; j++) {
					set2.add(num+nums[j]);
				}
			}
			set=set2;
		}
		
		System.out.println(set.size());
		br.close();
	}
	
}
