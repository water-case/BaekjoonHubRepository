import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static int N;

    private static void solve() {
        StringBuilder res = new StringBuilder();

        for(int i=0; i<N/4; i++) {
            res.append("long ");
        }
        res.append("int");

        System.out.println(res.toString());
    }

}
