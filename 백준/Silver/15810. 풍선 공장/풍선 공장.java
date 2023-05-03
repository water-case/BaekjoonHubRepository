import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        nArr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++) {
            nArr[i] = Integer.parseInt(st.nextToken());
        }

        br.close();
    }

    static int N, M, nArr[];

    private static void solve() {
        long res = 0;

        long start = 0, end = 1_000_000_000_000L;
        while(start <= end) {
            long mid = (start + end) / 2;

            long cnt = 0;
            for(int n : nArr) {
                cnt += mid / n;
            }

            if(cnt >= M) {
                res = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        System.out.println(res);
    }

}
