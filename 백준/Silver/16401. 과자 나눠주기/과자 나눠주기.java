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
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        snackList = new ArrayList<>();
        st = new StringTokenizer(br.readLine(), " ");
        max = 0;
        for(int i=0; i<N; i++) {
            int n = Integer.parseInt(st.nextToken());
            snackList.add(n);
            max = Math.max(max, n);
        }
        Collections.sort(snackList);

        br.close();
    }

    static int N, M, max;
    static List<Integer> snackList;

    private static void solve() {
        int res = 0;

        int start = 1, end = max;

        while(start <= end) {
            int mid = (start + end) / 2;

            int cnt = 0;
            for(int i : snackList) {
                cnt += i/mid;
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
