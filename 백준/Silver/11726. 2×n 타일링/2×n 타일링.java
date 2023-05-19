import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static int n;
    static final int MOD = 10_007;

    private static void solve() {
        int[] res = dp(n);

        System.out.println(res[n]);
    }

    private static int[] dp(int n) {
        int[] memo = new int[n+2];

        memo[1] = 1;
        memo[2] = 2;
        for(int i=3; i<=n; i++) {
            memo[i] = (memo[i-1] + memo[i-2]) % MOD;
        }

        return memo;
    }

}
