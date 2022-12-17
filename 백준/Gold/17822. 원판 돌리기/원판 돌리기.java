import java.io.*;
import java.util.*;

public class Main {

    static int N,M,T;
    static int[][] circle;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        
        init(br, st);

        while(T-->0) {
            st=new StringTokenizer(br.readLine()," ");
            int x=Integer.parseInt(st.nextToken());
            int d=Integer.parseInt(st.nextToken());
            int k=Integer.parseInt(st.nextToken());
            
            rotate(x,d,k);
            search();
        }

        int sum=Arrays.stream(circle).flatMapToInt(ia->Arrays.stream(ia)).sum();
        System.out.println(sum);
        br.close();
    }

    private static void search() {
        boolean noNum=true;
        boolean[][] tmp=new boolean[N][M];
        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                if(circle[i][j]==0) continue;
                boolean chk=false;
                if(circle[i][j]==circle[i][(j+1)%M]) {
                    tmp[i][(j+1)%M]=true;
                    chk=true; 
                }
                if(circle[i][j]==circle[i][(j+M-1)%M]) {
                    tmp[i][(j+M-1)%M]=true;
                    chk=true;
                }
                if(i+1<N && circle[i][j]==circle[i+1][j]) {
                    tmp[i+1][j]=true;
                    chk=true;
                }
                if(i-1>0 && circle[i][j]==circle[i-1][j]) {
                    tmp[i-1][j]=true;
                    chk=true;
                }
                    
                if(chk) {
                    tmp[i][j]=true;
                    noNum=false;
                }
            }
        }
        
        if(noNum) {
            int cnt=0;
            for(int i=0; i<N; i++)
                for(int j=0; j<M; j++)
                    if(circle[i][j]!=0) cnt++;
            int sum=Arrays.stream(circle).flatMapToInt(ia->Arrays.stream(ia)).sum();
            double avg=(double)sum/cnt;
            for(int i=0; i<N; i++) {
                for(int j=0; j<M; j++) {
                    if(circle[i][j]>avg) circle[i][j]--;
                    else if(circle[i][j]!=0 && circle[i][j]<avg) circle[i][j]++;
                }
            }
        } else {
            for(int i=0; i<N; i++)
                for(int j=0; j<M; j++)
                    if(tmp[i][j])
                        circle[i][j]=0;
        }
    }

    private static void rotate(int x, int d, int k) {
        int idx=x-1;
        int direct=d==0?1:-1;
        while(idx<N) {
            int[] tmp=new int[M];
            
            for(int i=0; i<M; i++) tmp[(M+i+(k*direct))%M]=circle[idx][i];
            circle[idx]=tmp;
            
            idx+=x;
        }
    }

    private static void init(BufferedReader br, StringTokenizer st) throws Exception {
        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());
        T=Integer.parseInt(st.nextToken());
        
        circle=new int[N][M];
        for(int i=0; i<N; i++) {
            st=new StringTokenizer(br.readLine()," ");
            for(int j=0; j<M; j++) 
                circle[i][j]=Integer.parseInt(st.nextToken());
        }
    }

}
