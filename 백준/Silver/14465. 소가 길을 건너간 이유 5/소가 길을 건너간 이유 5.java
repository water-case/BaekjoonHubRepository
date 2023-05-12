import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        crash = new boolean[N];
        Arrays.fill(crash, true);
        for(int i=0; i<B; i++) {
            int n = Integer.parseInt(br.readLine())-1;
            crash[n] = false;
        }

        br.close();
    }

    static int N, K, B;
    static boolean[] crash;

    private static void solve() {
        int res = 0;

        int cnt = 0;
        for(int i=0; i<K; i++) {
            if(crash[i]) {
                cnt++;
            }
        }
        res = cnt;

        for(int i=K; i<N; i++) {
            cnt = crash[i] ? cnt+1 : cnt;
            cnt = crash[i-K] ? cnt-1 : cnt;

            res = Math.max(res, cnt);
        }

        res = res >= K ? 0 : K - res;
        System.out.println(res);
    }

}
