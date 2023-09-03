import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long[] memo = new long[1_000_001];
        memo[1] = 1;
        memo[2] = 2;
        memo[3] = 4;
        for(int i=4; i<1_000_001; i++) {
            memo[i] = (memo[i-1] + memo[i-2] + memo[i-3]) % 1_000_000_009;
        }

        int T = Integer.parseInt(br.readLine());

        StringBuilder res = new StringBuilder();
        while(T-->0) {
            int n = Integer.parseInt(br.readLine());

            res.append(memo[n]).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
