import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        nArr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++) {
            nArr[i] = Integer.parseInt(st.nextToken());
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static int N;
    static int[] nArr;

    private static void solve() {
        int res = 0;

        res = dp(N);

        System.out.println(res);
    }

    private static int dp(int n) {
        int res = 0;

        int[] memo = new int[n];
        for(int i=0; i<n; i++) {
            memo[i] = nArr[i];

            for(int j=0; j<i; j++) {
                if(nArr[j]<nArr[i] && memo[i]<memo[j]+nArr[i]) {
                    memo[i] = memo[j]+nArr[i];
                }
            }

            res = Math.max(res, memo[i]);
        }

        return res;
    }

}
