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
        M = Integer.parseInt(st.nextToken());

        nArr = new int[N];
        for(int i=0; i<N; i++) {
            int n = Integer.parseInt(br.readLine());

            if (n <= K) {
                nArr[i] = 0;
            } else if(n < 2*K) {
                nArr[i] = n-K;
            } else {
                nArr[i] = n-2*K;
            }
        }

        br.close();
    }

    static int N, K, M, nArr[];

    private static void solve() {
        int res = -1;

        int start = 1, end = 1_000_000_000;
        while(start <= end) {
            int mid = (start + end) / 2;

            int cnt = 0;
            for(int i=0; i<N; i++) {
                cnt += nArr[i] / mid;
            }

            if(cnt >= M) {
                res = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(res);
    }

}
