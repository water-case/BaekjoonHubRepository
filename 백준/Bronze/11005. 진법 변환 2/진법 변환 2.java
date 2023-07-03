import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static int N, B;

    private static void solve() {
        StringBuilder res = new StringBuilder();

        while(N>0) {
            int cal = N%B;

            if(cal >= 10) {
                res.append((char) (cal + 'A' - 10));
            } else {
                res.append(cal);
            }

            N /= B;
        }

        res.reverse();

        System.out.println(res.toString());
    }

}
