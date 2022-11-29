import java.io.*;
import java.util.*;

public class Main {

	static class Light {
		int R,G;
		int cycle=0;
		
		public Light(int R, int G) {
			this.R=R;
			this.G=G;
			this.calCycle();
		}
		
		public void calCycle() {
			cycle=R+G;
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int N=Integer.parseInt(st.nextToken());
		int L=Integer.parseInt(st.nextToken());
		
		Light[] road=new Light[L];
		for(int i=0; i<N; i++) {
			st=new StringTokenizer(br.readLine()," ");
			int D=Integer.parseInt(st.nextToken())-1;
			int R=Integer.parseInt(st.nextToken());
			int G=Integer.parseInt(st.nextToken());
			road[D]=new Light(R, G);
		}
		
		int time=0;
		int pos=0;
		while(true) {
			if(road[pos]!=null) {
				int t=time%road[pos].cycle;
				if(t>=road[pos].R) pos++;
			} else {
				pos++;
			}
			
			if(pos==L) break;
			time++;
		}

		System.out.println(time);
		br.close();
	}
	
}
