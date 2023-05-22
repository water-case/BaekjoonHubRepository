import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        P = new int[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=1; i<=N; i++) {
            P[i] = Integer.parseInt(st.nextToken());
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static int N, P[];

    private static void solve() {
        int res = 0;

        int[] memo = dp(N);
        res = memo[N];

        System.out.println(res);
    }

    private static int[] dp(int n) {
        int[] res = new int[n+1];

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                res[i] = Math.max(res[i], res[i-j] + P[j]);
            }
        }

        return res;
    }

}
