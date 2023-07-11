import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = st.nextToken().toCharArray();
        B = Integer.parseInt(st.nextToken());

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static char[] N;
    static int B;

    private static void solve() {
        int res = 0;

        int b = 1;
        for(int i=N.length-1; i>=0; i--) {

            int n = N[i]>=65 ? N[i]-55 : N[i]-48;
            res += n * b;

            b = b * B;
        }

        System.out.println(res);
    }

}
