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
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        nArr = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++) {
            nArr[i] = Integer.parseInt(st.nextToken());
        }

        br.close();
    }

    static int n, m, nArr[];

    private static void solve() {
        long res = 0;

        long sum = 0;
        for(int i=0; i<n; i++) {
            sum += nArr[i];

            if(i>=m) {
                sum -= nArr[i-m];
            }

            res = Math.max(res, sum);
        }

        System.out.println(res);
    }

}
