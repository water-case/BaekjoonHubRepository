import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        init(br);
        solve();

        System.out.println(res);
        br.close();
    }

    static int res, A, I;

    private static void solve() {

        res = A * (I-1) + 1;

    }

    private static void init(BufferedReader br) throws Exception {
        res = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        A = Integer.parseInt(st.nextToken());
        I = Integer.parseInt(st.nextToken());
    }

}
