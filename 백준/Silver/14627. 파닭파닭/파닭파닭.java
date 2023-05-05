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
        S = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        max = 0;
        sArr = new int[S];
        for(int i=0; i<S; i++) {
            sArr[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, sArr[i]);
        }

        br.close();
    }

    static int S, C, sArr[], max;

    private static void solve() {
        long res = 0;

        int start = 1, end = max;
        while(start <= end) {
            int mid = (start + end) / 2;

            int cnt = 0;
            long sum = 0;
            for(int s : sArr) {
                int tcnt = s / mid;
                cnt += tcnt;
                sum += s - (tcnt * mid);
            }

            if(cnt >= C) {
                res = sum + ((cnt - C) * mid);
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(res);
    }

}
