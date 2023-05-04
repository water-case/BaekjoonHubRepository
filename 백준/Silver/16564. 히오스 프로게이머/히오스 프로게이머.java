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
        K = Integer.parseInt(st.nextToken());

        nArr = new int[N];
        for(int i=0; i<N; i++) {
            nArr[i] = Integer.parseInt(br.readLine());
        }

        br.close();
    }

    static int N, K, nArr[];

    private static void solve() {
        int res = 0;

        int start = 1, end = Integer.MAX_VALUE;
        while(start <= end) {
            int mid = (int) (((long)start + end) / 2);
            long sub = 0;

            for(int n : nArr) {
                if(n < mid) {
                    sub += mid - n;
                }
            }

            if(sub > K) {
                end = mid - 1;
            } else {
                res = mid;
                start = mid + 1;
            }
        }

        System.out.println(res);
    }

}
