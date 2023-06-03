import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];

        for(int i=0; i<n; i++) {
            String[] sa = br.readLine().split("");
            for(int j=0; j<m; j++) {
                map[i][j] = Integer.parseInt(sa[j]);
            }
        }

        br.close();
    }

    static int n, m, map[][];

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    private static void solve() {
        int res = 0;

        res = dp();

        System.out.println(res);
    }

    private static int dp() {
        MemoInit memoInit = memoInit();
        int[][] memo = memoInit.memo;
        int res = memoInit.max;

        for(int i=1; i<n; i++) {
            for(int j=1; j<m; j++) {

                if(map[i][j] == 0) {
                    memo[i][j] = 0;
                    continue;
                }

                memo[i][j] = Math.min(memo[i-1][j-1], Math.min(memo[i-1][j], memo[i][j-1])) + 1;
                res = Math.max(res, memo[i][j]);
            }
        }

        return res*res;
    }

    private static MemoInit memoInit() {
        int[][] memo = new int[n][m];
        int max = 0;

        for(int i=0; i<n; i++) {
            memo[i][0] = map[i][0];

            if(memo[i][0] == 1) {
                max = 1;
            }
        }
        for(int i=0; i<m; i++) {
            memo[0][i] = map[0][i];

            if(memo[0][i] == 1) {
                max = 1;
            }
        }

        return new MemoInit(memo, max);
    }

    private static class MemoInit {
        int[][] memo;
        int max;

        public MemoInit(int[][] memo, int max) {
            this.memo = memo;
            this.max = max;
        }
    }

}
