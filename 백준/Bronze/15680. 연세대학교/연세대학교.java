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
        String res = N==0 ? "YONSEI" : "Leading the Way to the Future";

        System.out.println(res);
    }

}
