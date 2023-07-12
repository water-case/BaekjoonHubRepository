import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        A = Long.parseLong(st.nextToken());
        B = Long.parseLong(st.nextToken());

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static long A, B;

    private static void solve() {
        System.out.println((A+B) * (A-B));
    }

}
