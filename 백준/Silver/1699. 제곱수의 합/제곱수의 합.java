import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static int N;

    private static void solve() {
        int res = 0;

        int[] memo = new int[N+1];
        for(int i=1; i<=N; i++) {
            memo[i] = i;
        }

        for(int i=1; i<=N; i++) {
            for(int j=1; j*j<=i; j++) {
                memo[i] = Math.min(memo[i], memo[i - (j*j)] + 1);
            }
        }
        res = memo[N];

        System.out.println(res);
    }

}
