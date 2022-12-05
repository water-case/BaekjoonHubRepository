import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int n=Integer.parseInt(br.readLine());
        int m=Integer.parseInt(br.readLine());
        
        int max=m;
        while(n-->0) {
            st=new StringTokenizer(br.readLine()," ");
            int in=Integer.parseInt(st.nextToken());
            int out=Integer.parseInt(st.nextToken());
            
            m=m+in-out;
            if(m<0) {
                max=0;
                break;
            }
            max=Integer.max(max, m);
        }
        System.out.println(max);
    }
    
}
