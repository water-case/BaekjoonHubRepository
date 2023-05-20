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
        int res = 0;

        int[] memo = dp(n);
        res = memo[n];

        System.out.println(res);
    }

    private static int[] dp(int n) {
        int[] res = new int[n+1];

        res[1] = 1;
        for(int i=2; i<=n; i++) {
            int cal = res[i-1] * 2;
            cal += (i%2==0) ? 1 : -1;

            res[i] =  cal % MOD;
        }

        return res;
    }

}
