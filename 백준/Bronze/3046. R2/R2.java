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

    static int res;
    static int r1, s;

    private static void solve() {
         res = 2*s - r1;
    }

    private static void init(BufferedReader br) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        r1 = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
    }

}
