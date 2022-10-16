import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		Stack<Integer> stack=new Stack();
		while(N-->0) {
			stack.push(Integer.parseInt(br.readLine()));
		}
		
		int n=0, res=0;
		while(!stack.isEmpty()) {
			int now=stack.pop();
			if(now>n) {
				n=now;
				res++;
			}
		}
		
		System.out.println(res);
		br.close();
	}
	
}
