import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        nArr = new int[N];
        for(int i=0; i<N; i++) {
            nArr[i] = Integer.parseInt(br.readLine());
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static int N, nArr[];

    private static void solve() {
        int res = 0;

        Arrays.sort(nArr);
        int cnt = nArr.length;
        for(int n : nArr) {
            res = Math.max(res, n * cnt--);
        }

        System.out.println(res);
    }

}
