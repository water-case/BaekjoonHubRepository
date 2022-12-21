import java.io.*;
import java.util.*;

public class Main {

    static int[] bridge;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        
        int n=Integer.parseInt(st.nextToken());
        int w=Integer.parseInt(st.nextToken());
        int L=Integer.parseInt(st.nextToken());
        
        st=new StringTokenizer(br.readLine()," ");
        int[] truck=new int[n];
        for(int i=0; i<n; i++) truck[i]=Integer.parseInt(st.nextToken());
        
        bridge=new int[w];
        int weight=0;
        int res=0;
        int idx=0;
        while(true) {
            if(idx==n) {
                if(weight==0) break;
                else weight-=nextTime();
                res++;
                continue;
            }
            
            res++;
            weight-=nextTime();
            if(weight+truck[idx]<=L) {
                weight+=truck[idx];newTruck(truck[idx]);
                idx++;
            }
        }
        
        System.out.println(res);
        br.close();
    }
    
    private static int newTruck(int weight) {
        bridge[0]=weight;
        return weight;
    }
    
    private static int nextTime() {
        int res=0;
        if(bridge[bridge.length-1]!=0) {
            res=bridge[bridge.length-1];
            bridge[bridge.length-1]=0;
        }
        
        for(int i=bridge.length-1; i>0; i--) {
            if(bridge[i]==0&&bridge[i-1]!=0) {
                bridge[i]=bridge[i-1];
                bridge[i-1]=0;
            }
        }
        return res;
    }
    
}
