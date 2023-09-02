import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] boxes = new int[n+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1; i<=n; i++) {
            boxes[i] = Integer.parseInt(st.nextToken());
        }

        int[] memo = new int[n+1];

        int res = 0;
        for(int i=1; i<=n; i++) {
            int idx = i;
            while(idx-->0) {
                if(boxes[idx] < boxes[i]) {
                    memo[i] = Math.max(memo[i], memo[idx] + 1);
                }
            }

            res = Math.max(res, memo[i]);
        }

        System.out.println(res);
        br.close();
    }

}
