import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine(), " ");
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		HashMap<String, Integer> map=new HashMap<>();
		String[] names=new String[N+1];
		for(int i=1; i<=N; i++) {
			String name=br.readLine();
			map.put(name, i);
			names[i]=name;
		}
		

		StringBuilder sb=new StringBuilder();
		for(int i=0; i<M; i++) {
			String find=br.readLine();
			if(isNum(find)) {
				int idx=Integer.parseInt(find);
				sb.append(names[idx]);
			} else {
				sb.append(map.get(find));
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
		br.close();
	}

	static boolean isNum(String find) {
		try {
			Integer.parseInt(find);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
}
