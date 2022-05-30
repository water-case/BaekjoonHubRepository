import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		String s=br.readLine(); 
		
		HashSet<String> set=new HashSet<>();
		for(int i=0; i<=s.length(); i++)
			for(int j=i; j<=s.length(); j++)
				set.add(s.substring(i, j));
		
		System.out.println(set.size()-1);
		br.close();
	}
	
}
