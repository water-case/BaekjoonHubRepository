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
        X = Integer.parseInt(st.nextToken());

        nArr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++) {
            nArr[i] = Integer.parseInt(st.nextToken());
        }

        br.close();
    }

    static int N, X, nArr[];

    private static void solve() {
        StringBuilder res = new StringBuilder();

        int sum = 0, cnt = 0, max = 0;

        for(int i=0; i<N; i++) {
            sum += nArr[i];
            if(i >= X) {
                sum -= nArr[i-X];
            }

            if(sum > max) {
                cnt = 1;
                max = sum;
            } else if(sum == max) {
                cnt++;
            }
        }

        if(sum == 0) {
            res.append("SAD");
        } else {
            res.append(max).append("\n").append(cnt);
        }

        System.out.println(res);
    }

}
