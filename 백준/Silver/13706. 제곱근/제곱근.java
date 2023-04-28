import java.io.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = new BigInteger(br.readLine());

        br.close();
    }

    static BigInteger N;

    private static void solve() {
        String res = "";

        BigInteger start = new BigInteger("1"), end = N;
        while(start.compareTo(end) <= 0) {
            BigInteger mid = start.add(end).divide(new BigInteger("2"));

            if(mid.multiply(mid).compareTo(N) >= 0) {
                res = mid.toString();
                end = mid.subtract(new BigInteger("1"));
            } else {
                start = mid.add(new BigInteger("1"));
            }
        }

        System.out.println(res);
    }

}
