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

    private static void solve() {
        long res = 0;

        long[] memo = dp(n);
        res = memo[n];

        System.out.println(res);
    }

    private static long[] dp(int n) {
        long[] res = new long[n+2];

        res[1] = 1;
        res[2] = 1;
        for(int i=3; i<=n; i++) {
            res[i] = res[i-1] + res[i-2];
        }

        return res;
    }

}
