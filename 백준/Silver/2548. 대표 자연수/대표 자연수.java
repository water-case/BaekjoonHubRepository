import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N=Integer.parseInt(br.readLine());
		ArrayList<Integer> nums=new ArrayList<>();
		
		st=new StringTokenizer(br.readLine()," ");
		for(int i=0; i<N; i++) nums.add(Integer.parseInt(st.nextToken()));
		
		Collections.sort(nums);
		
		int res=0;
		if(N%2==0) res=nums.get((N/2)-1);
		else       res=nums.get(N/2);
		
		System.out.println(res);
		br.close();
	}
	
}
