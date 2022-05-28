import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");

		int N=Integer.parseInt(st.nextToken()); // 듣도못한
		int M=Integer.parseInt(st.nextToken()); // 보도못한
		
		HashSet<String> set=new HashSet<>();
		for(int i=0; i<N; i++) set.add(br.readLine());
		
		ArrayList<String> ans=new ArrayList<>();
		int cnt=0;
		for(int i=0; i<M; i++) {
			String s=br.readLine();
			if(set.contains(s)) {
				cnt++;
				ans.add(s);
			}
		}
				
		System.out.println(cnt);
		
		Collections.sort(ans);
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<ans.size(); i++) sb.append(ans.get(i)).append("\n");
		System.out.println(sb.toString());
		
		br.close();
	}
	
}
