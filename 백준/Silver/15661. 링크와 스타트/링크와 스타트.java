import java.io.*;
import java.util.*;

public class Main {

	static int N, res=Integer.MAX_VALUE;
	static int[][] arr;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N=Integer.parseInt(br.readLine());
		arr=new int[N][N];
		
		for(int i=0; i<N; i++) {
			st=new StringTokenizer(br.readLine()," ");
			for(int j=0; j<N; j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
				arr[j][i]+=arr[i][j];
			}
		}
		
		SubSet(0,new boolean[N]);
		System.out.println(res);

		br.close();
	}
	
	static void SubSet(int cnt, boolean[] v) {
		if(cnt==N) return;
		
		int res1=0, res2=0;
		ArrayList<Integer> team1=new ArrayList<>();
		ArrayList<Integer> team2=new ArrayList<>();
		for(int i=0; i<N; i++) {
			if(v[i]) team1.add(i);
			else team2.add(i);
		}
		if(team1.size()!=0&&team2.size()!=0) {
			for(int i=0; i<team1.size(); i++) {
				for(int j=i+1; j<team1.size(); j++) {
					res1+=arr[team1.get(i)][team1.get(j)];
				}
			}
			for(int i=0; i<team2.size(); i++) {
				for(int j=i+1; j<team2.size(); j++) {
					res2+=arr[team2.get(i)][team2.get(j)];
				}
			}
			res=Math.min(res, Math.abs(res1-res2));
		}
		
		v[cnt]=true;
		SubSet(cnt+1,v);
		v[cnt]=false;
		SubSet(cnt+1,v);
	}
	
}
