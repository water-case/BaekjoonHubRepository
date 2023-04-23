import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Long.parseLong(br.readLine());

        br.close();
    }

    static long N;

    private static void solve() {
        long res = 0;
        long start = 0, end = N;

        while(start <= end) {
            long mid = (start + end) / 2;

            if((long)Math.pow(mid, 2) >= N) {
                res = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        System.out.println(res);
    }

}
