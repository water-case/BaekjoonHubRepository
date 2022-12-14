import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int N=1;
        
        StringBuilder sb=new StringBuilder();
        while(true) {
            st=new StringTokenizer(br.readLine()," ");
            int o=Integer.parseInt(st.nextToken());
            int w=Integer.parseInt(st.nextToken());
            if(o==0&&w==0) break;
            String res="";
            while(true) {
                st=new StringTokenizer(br.readLine()," ");
                char order=st.nextToken().charAt(0);
                int n=Integer.parseInt(st.nextToken());
                
                if(w<=0) res="RIP";
                if(order=='#') {
                    if(!"RIP".equals(res)) res=w>(o*0.5) && w<(o*2)?":-)":":-(";
                    break;
                }
                else if(order=='E') w-=n;
                else w+=n;
            }
            sb.append(N++).append(" ").append(res).append("\n");
        }
        
        System.out.println(sb.toString());
        br.close();
    }
    
}
