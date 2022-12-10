import java.io.*;
import java.util.*;

public class Main {

    static int[][] bucket=new int[3][2];
    
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        for(int i=0; i<3; i++) {
            st=new StringTokenizer(br.readLine()," ");
            bucket[i][0]=Integer.parseInt(st.nextToken());
            bucket[i][1]=Integer.parseInt(st.nextToken());
        }
        
        mixingMilk();
        
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<3; i++) sb.append(bucket[i][1]).append("\n");
        System.out.println(sb.toString());
    }

    private static void mixingMilk() {
        int cnt=33;
        while(cnt-->0) {
            for(int i=0; i<3; i++) {
                int capa=0;
                if(bucket[i][1]+bucket[(i+1)%3][1]>bucket[(i+1)%3][0]) {
                    capa=bucket[(i+1)%3][0]-bucket[(i+1)%3][1];
                    bucket[(i+1)%3][1]=bucket[(i+1)%3][0];
                    bucket[i][1]-=capa;
                } else {
                    bucket[(i+1)%3][1]+=bucket[i][1];
                    bucket[i][1]=0;
                }
            }
        }
        
        int capa=0;
        if(bucket[0][1]+bucket[1][1]>bucket[1][0]) {
            capa=bucket[1][0]-bucket[1][1];
            bucket[1][1]=bucket[1][0];
            bucket[0][1]-=capa;
        } else {
            bucket[1][1]+=bucket[0][1];
            bucket[0][1]=0;
        }
    }
    
}
