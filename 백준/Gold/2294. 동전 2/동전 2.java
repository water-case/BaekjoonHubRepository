import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        nArr = new int[n];
        for(int i=0; i<n; i++) {
            nArr[i] = Integer.parseInt(br.readLine());
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static int n, k, nArr[];
    static final int INF = 10_001;

    private static void solve() {
        int res = 0;

        int[] memo = new int[k+1];
        Arrays.fill(memo, INF);
        memo[0] = 0;

        for(int i=0; i<n; i++) {
            for(int j=nArr[i]; j<=k; j++) {
                memo[j] = Math.min(memo[j], memo[j - nArr[i]] + 1);
            }
        }
        res = memo[k] == INF ? -1 : memo[k];

        System.out.println(res);
    }

}
