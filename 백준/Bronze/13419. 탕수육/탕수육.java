import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        
        int T=Integer.parseInt(br.readLine());
        while(T-->0) {
            char[] ca=br.readLine().toCharArray();
            StringBuilder res1=new StringBuilder();
            StringBuilder res2=new StringBuilder();
            
            for(int i=0; i<ca.length; i++) {
                if(i%2==0) res1.append(ca[i]);
                else       res2.append(ca[i]);
            }
            
            if(ca.length%2==1) {
                String tmp=res1.toString();
                res1.append(res2);
                res2.append(tmp);
            }
            
            sb.append(res1).append("\n").append(res2).append("\n");
        }
        
        System.out.println(sb.toString());
        br.close();
    }
    
}
