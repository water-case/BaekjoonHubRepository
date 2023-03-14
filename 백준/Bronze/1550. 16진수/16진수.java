import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        numList = br.readLine().split("");

        br.close();
    }

    static String[] numList;

    private static void solve() {
        int res = Arrays.stream(numList)
                .map(s -> hexadecimalToDecimal(s))
                .reduce(0, (n1, n2) -> n1*16 + n2);

        System.out.println(res);
    }

    private static int hexadecimalToDecimal(String str) {
        int res = Integer.parseInt(str, 16);

        return res;
    }

}
