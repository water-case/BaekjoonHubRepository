import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        X = br.readLine().toCharArray();

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static char[] X;

    private static void solve() {
        StringBuilder res = new StringBuilder();

        int cnt = 0;
        int sum = X[0];

        while(X.length > 1) {

            cnt ++;
            sum = 0;

            for(int i=0; i<X.length; i++) {
                sum += X[i] - '0';
            }

            X = String.valueOf(sum).toCharArray();

            if(sum < 10) {
                break;
            }
        }

        res.append(cnt).append("\n").append(sum%3 == 0 ? "YES" : "NO");
        System.out.println(res.toString());
    }

}
