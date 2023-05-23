import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        tcList = new ArrayList<>();

        int T = Integer.parseInt(br.readLine());
        while(T-->0) {
            int n = Integer.parseInt(br.readLine());
            int[][] nArr = new int[2][n+1];

            for(int i=0; i<2; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                for(int j=1; j<=n; j++) {
                    nArr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            tcList.add(new TC(n, nArr));
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static List<TC> tcList;

    private static void solve() {
        StringBuilder res = new StringBuilder();

        for(TC tc : tcList) {
            int n = tc.n;
            int[][] nArr = tc.nArr;

            int[][] memo = dp(n, nArr);

            int max = Math.max(memo[0][n], memo[1][n]);
            res.append(max).append("\n");
        }

        System.out.println(res);
    }

    private static int[][] dp(int n, int[][] nArr) {
        int[][] res = new int[2][n+1];

        res[0][1] = nArr[0][1];
        res[1][1] = nArr[1][1];
        for(int i=2; i<=n; i++) {
            res[0][i] = Math.max(res[1][i-1], res[1][i-2]) + nArr[0][i];
            res[1][i] = Math.max(res[0][i-1], res[0][i-2]) + nArr[1][i];
        }

        return res;
    }

    private static class TC {
        int n;
        int[][] nArr;

        public TC(int n, int[][] nArr) {
            this.n = n;
            this.nArr = nArr;
        }
    }

}
