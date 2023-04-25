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
        int M = Integer.parseInt(st.nextToken());

        max = 0;
        mArr = new int[M];
        for(int i=0; i<M; i++) {
            mArr[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, mArr[i]);
        }

        br.close();
    }

    static int N, max;
    static int[] mArr;

    private static void solve() {
        int res = 0;

        int start = 1, end = max;
        while(start <= end) {
            int mid = (start + end) / 2;

            int cnt = 0;
            for(int i : mArr) {
                cnt += i/mid;
                cnt += i%mid==0 ? 0 : 1;

                if(cnt > N) {
                    break;
                }
            }

            if(cnt > N) {
                start = mid + 1;
            } else {
                res = mid;
                end = mid - 1;
            }

        }

        System.out.println(res);
    }

}
