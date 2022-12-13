import java.io.*;
import java.util.*;

public class Main {

    static int N, M;
    static int[] bulb;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        
        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());
        bulb=new int[N];
        
        st=new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N; i++) bulb[i]=Integer.parseInt(st.nextToken());
        
        while(M-->0) {
            st=new StringTokenizer(br.readLine()," ");
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            int c=Integer.parseInt(st.nextToken());
            if(a!=1 && b>c) {
                c+=b;
                b=b-c;
                c=b-c;
            }
            command(a,b,c);
        }
        
        StringBuilder sb=new StringBuilder();
        for(int i:bulb) sb.append(i).append(" ");
        System.out.println(sb.toString());
        br.close();
    }

    private static void command(int a, int b, int c) {
        switch(a) {
        case 1: 
            bulb[b-1]=c; 
            break;
        case 2: 
            for(int i=b-1; i<=c-1; i++) bulb[i]=bulb[i]==0?1:0;
            break;
        case 3:
            for(int i=b-1; i<=c-1; i++) bulb[i]=0;
            break;
        case 4:
            for(int i=b-1; i<=c-1; i++) bulb[i]=1;
            break;
        }
    }

}
