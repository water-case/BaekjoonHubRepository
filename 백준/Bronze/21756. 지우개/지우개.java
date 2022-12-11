import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int N=Integer.parseInt(br.readLine());
        int[] map=new int[N+1];
        for(int i=1; i<=N; i++) map[i]=i;
        
        while(N>1) {
            int[] tmp=new int[N+1];
            for(int i=1; i*2<=N; i++) {
                if(map[i*2]==0) break;
                tmp[i]=map[i*2];
            }
            map=tmp;
            if(map[2]==0) break;
        }
        System.out.println(map[1]);
    }
    
}
