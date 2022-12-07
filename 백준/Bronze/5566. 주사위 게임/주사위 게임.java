import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        
        int[] board=new int[N+1];
        for(int i=1; i<=N; i++) board[i]=Integer.parseInt(br.readLine());
        
        int idx=1;
        int res=0;
        while(M-->0) {
            res++;
            int m=Integer.parseInt(br.readLine());
            
            idx=idx+m;
            if(idx>=N) break;
            idx+=board[idx];
            if(idx>=N) break;
        }
        System.out.println(res);
    }
    
}
