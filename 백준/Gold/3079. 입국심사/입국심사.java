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
        M = Integer.parseInt(st.nextToken());

        tArr = new int[N];
        for(int i=0; i<N; i++) {
            tArr[i] = Integer.parseInt(br.readLine());
        }

        br.close();
    }

    static int N, M, tArr[];

    private static void solve() {
        long res = 0;

        long start = 1, end = 1_000_000_000L * 1_000_000_000L;
        while(start <= end) {
            long mid = (start + end) / 2;

            long cnt = 0;
            for(int t : tArr) {
                cnt += mid / t;

                if(cnt >= M) {
                    break;
                }
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
