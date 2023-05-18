import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        tArr = new int[T];
        for(int i=0; i<T; i++) {
            tArr[i] = Integer.parseInt(br.readLine());
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static int[] tArr;
    static final int N_SIZE = 11;

    private static void solve() {
        StringBuilder res = new StringBuilder();

        int[] memo = makeMemo(N_SIZE);

        for(int t : tArr) {
            res.append(memo[t]).append("\n");
        }

        System.out.println(res);
    }

    private static int[] makeMemo(int size) {
        int[] memo = new int[size + 1];

        memo[1] = 1; // 1
        memo[2] = 2; // 2, 1+1
        memo[3] = 4; // 3, 2+1, 1+2, 1+1+!

        for(int i=4; i<=N_SIZE; i++) {
            memo[i] = memo[i-1] + memo[i-2] + memo[i-3];
        }

        return memo;
    }

}
