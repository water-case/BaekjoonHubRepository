import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] next = new int[N];
        for(int i=0; i<N; i++) {
            next[i] = Integer.parseInt(br.readLine());
        }

        int res = 0, idx = 0;
        while(true) {
            res++;
            idx = next[idx];

            if(idx == K) break;
            
            if(res > N) {
                res = -1;
                break;
            }
        }

        System.out.println(res);
        br.close();
    }

}
