import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int N=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> score=new ArrayList<>();
		st=new StringTokenizer(br.readLine()," ");
		for(int i=0; i<N; i++) score.add(Integer.parseInt(st.nextToken()));
		
		Collections.sort(score);

		System.out.println(score.get(score.size()-k));
		br.close();
	}
	
}
