import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        
        int T=Integer.parseInt(br.readLine());
        String res1="", res2="";
        while(T-->0) {
            char[] ca=br.readLine().toCharArray();
            
            res1=""; res2="";
            int size=ca.length;
            if(size%2==0) {
                for(int i=0; i<size; i++) {
                    if(i%2==0) res1+=ca[i];
                    else       res2+=ca[i];
                }
            } else {
                for(int i=0; i<size; i++) {
                    if(i%2==0) res1+=ca[i];
                    else       res2+=ca[i];
                }
                for(int i=0; i<size; i++) {
                    if(i%2==0) res2+=ca[i];
                    else       res1+=ca[i];
                }
            }
            sb.append(res1).append("\n").append(res2).append("\n");
        }
        
        System.out.println(sb.toString());
        br.close();
    }
    
}
