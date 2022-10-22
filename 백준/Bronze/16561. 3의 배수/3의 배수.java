import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Integer> nlist=new ArrayList<>();
		int idx=3;
		while(idx<3000) {
			nlist.add(idx);
			idx+=3;
		}
		
		int n=Integer.parseInt(br.readLine());
		
		int cnt=0;
		for(int i1:nlist) {
			for(int i2:nlist) {
				int cal=i1+i2;
				if(cal>=n) break;
				for(int i3:nlist) {
					int cal2=cal+i3;
					if(cal2>n) break;
					
					if(cal2==n) cnt++;
				}
			}
		}
		
		System.out.println(cnt);
		br.close();
	}
	
}
