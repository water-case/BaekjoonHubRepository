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
        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());
        Z = (Y * 100) /X;

        br.close();
    }

    static long X, Y, Z;
    static final long MAX = 1_000_000_000;

    private static void solve() {
        long res = -1;

        long start = 0, end = MAX;
        while(start <= end) {
            long mid = (start + end) / 2;

            long cal = ((Y + mid) * 100) / (X + mid);
            if(Z >= cal) {
                res = mid + 1;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(res == (MAX+1) ? -1 : res);
    }

}
