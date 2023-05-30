import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        X = Integer.parseInt(br.readLine());

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static int X;

    private static void solve() {
        int res = 0;

        for(int i=0; i<7; i++) {
            if((X & (1<<i)) > 0) {
                res++;
            }
        }

        System.out.println(res);
    }

}
