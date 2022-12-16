import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st;
        
        int T=Integer.parseInt(br.readLine());
        while(T-->0) {
            int N=Integer.parseInt(br.readLine());
            int[] pigs=new int[6];
            st=new StringTokenizer(br.readLine()," ");
            for(int i=0; i<6; i++) pigs[i]=Integer.parseInt(st.nextToken());
            int res=1;
            
            while(true) {
                if(Arrays.stream(pigs).sum()>N) break;
                
                int[] tmp=new int[6];
                for(int i=0; i<6; i++) tmp[i]=pigs[i]+pigs[(i+1)%6]+pigs[(i+5)%6]+pigs[(i+3)%6];
                pigs=tmp;
                res++;
            }
            sb.append(res).append("\n");
        }
        
        System.out.println(sb.toString());
        br.close();
    }
    
}
