import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N=Integer.parseInt(br.readLine());
		boolean[] v=new boolean[500_001];
		ArrayList<int[]> line=new ArrayList<>();
		for(int i=0; i<N; i++) {
			st=new StringTokenizer(br.readLine()," ");
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			
			line.add(new int[] {a,b});
			v[a]=true;
		}
		Collections.sort(line, (o1, o2)->Integer.compare(o1[0], o2[0]));

		int idx=0;
		int[] lis=new int[N];
		lis[0]=line.get(0)[1];
		ArrayList<int[]> lisline=new ArrayList<>();
		lisline.add(new int[] {0, line.get(0)[0]});
		for(int i=1; i<N; i++) {
			if(lis[idx]<line.get(i)[1]) {
				lis[++idx]=line.get(i)[1];
				lisline.add(new int[] {idx, line.get(i)[0]});
			} else {
				int b=Arrays.binarySearch(lis, 0, idx, line.get(i)[1]);
				lis[-b-1]=line.get(i)[1];
				lisline.add(new int[] {-b-1, line.get(i)[0]});
			}
		}
		System.out.println(N-idx-1);
		
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=N-1; i>=0; i--) {
			if(lisline.get(i)[0] == idx) {
				list.add(lisline.get(i)[1]);
				idx--;
			}
		}
		for(int n:list) {
			v[n]=false;
		}
		for(int i=0; i<500001; i++) {
			if(v[i]) System.out.println(i);
		}
		br.close();
	}
	
}
