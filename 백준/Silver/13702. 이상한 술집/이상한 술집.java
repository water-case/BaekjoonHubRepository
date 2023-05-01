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

        max = 0;
        nArr = new int[N];
        for(int i=0; i<N; i++) {
            nArr[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, nArr[i]);
        }

        br.close();
    }

    static int N, K, nArr[], max;

    private static void solve() {
        int res = 0;

        int start = 1, end = max;
        while(start <= end) {
            int mid = (int) ( ((long)start + end) / 2);

            int cnt = 0;
            for(int n : nArr) {
                cnt += n/mid;
            }

            if(cnt>=K) {
                res = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(res);
    }

}
