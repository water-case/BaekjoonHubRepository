import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        
        int[] order=new int[N];
        for(int i=0; i<N; i++) order[i]=Integer.parseInt(br.readLine());
        
        int[] price=new int[M];
        for(int i=0; i<M; i++) price[i]=Integer.parseInt(br.readLine());
        
        int[] vote=new int[N];
        for(int i=0; i<M; i++) {
            for(int j=0; j<N; j++) {
                if(order[j]<=price[i]) {
                    vote[j]++;
                    break;
                }
            }
        }
        
        int idx=-1, max=-1;
        for(int i=0; i<N; i++) {
            if(max<vote[i]) {
                max=vote[i];
                idx=i;
            }
        }
        System.out.println(idx+1);
        br.close();
    }
    
}
