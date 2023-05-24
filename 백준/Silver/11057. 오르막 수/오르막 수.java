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
    static final int MOD = 10_007;

    private static void solve() {
        int res = 0;

        res = dp(N);

        System.out.println(res);
    }

    private static int dp(int n) {
        int res = 0;

        int[][] memo = new int[n+1][10];
        for(int i=0; i<=9; i++) {
            memo[1][i] = 1;
        }

        for(int i=2; i<=n; i++) {
            memo[i][0] = 1;
            for(int j=1; j<=9; j++) {
                memo[i][j] = (memo[i][j-1] + memo[i-1][j]) % MOD;
            }
        }

        for(int i=0; i<=9; i++) {
            res += memo[n][i];
        }

        return res % MOD;
    }

}
