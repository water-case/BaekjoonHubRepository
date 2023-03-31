import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        br.close();
    }

    static int N;

    private static void solve() {
        int res = 0;

        int idx = 0, pow = 10, cnt = 1;
        while(idx++ < N) {
            if(idx < pow) {
                res += cnt;
            } else {
                cnt++;
                res += cnt;
                pow *= 10;
            }
        }

        System.out.println(res);
    }

}
