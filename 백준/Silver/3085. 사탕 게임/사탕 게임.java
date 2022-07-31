import java.io.*;
import java.util.*;

public class Main {

	static int res=0, N;
	static char[][] board;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		N=Integer.parseInt(br.readLine());
		board=new char[N][N];
		for(int i=0; i<N; i++) {
			board[i]=br.readLine().toCharArray();
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N-1; j++) {
				// 가로
				swapR(i,j);
				search();
				swapR(i,j);
				
				// 세로
				swapC(j,i);
				search();
				swapC(j,i);
			}
		}
		System.out.println(res);
		br.close();
	}
	
	static void swapR(int i, int j) {
		char tmp=board[i][j];
		board[i][j]=board[i][j+1];
		board[i][j+1]=tmp;
	}
	static void swapC(int j, int i) {
		char tmp=board[j][i];
		board[j][i]=board[j+1][i];
		board[j+1][i]=tmp;
	}
	
	static void search() {
		// 가로 검사
		for(int i=0; i<N; i++) {
			int cnt=1;
			for(int j=0; j<N-1; j++) {
				if(board[i][j]==board[i][j+1]) {
					cnt++;
				} else {
					cnt=1;
				}
				res=Math.max(res, cnt);
			}
		}
		// 세로 검사
		for(int i=0; i<N; i++) {
			int cnt=1;
			for(int j=0; j<N-1; j++) {
				if(board[j][i]==board[j+1][i]) {
					cnt++;
				} else {
					cnt=1;
				}
				res=Math.max(res, cnt);
			}
		}
	}
	
}
