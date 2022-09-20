import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		StringBuffer sb=new StringBuffer();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		while(true) {
			String[] sa=br.readLine().split(" ");
			if(Integer.parseInt(sa[0])==-1) break;
			
			ArrayList<Integer> list=new ArrayList<>();
			for(String s:sa) {
				list.add(Integer.parseInt(s));
			}
			Collections.sort(list);
			
			int cnt=0;
			for(int i=0; i<list.size(); i++) {
				int a=list.get(i)*2;
				for(int j=1; j<list.size(); j++) {
					int b=list.get(j);
					if(a==b) {
						cnt++;
						break;
					}
					if(b>a) break;
				}
			}
			sb.append(cnt).append("\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
