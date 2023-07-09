import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        money = Integer.parseInt(br.readLine());

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static int money;

    private static void solve() {
        int res = 0;
        int change = 1_000 - money;

        int[] units = {500, 100, 50, 10, 5, 1};
        for(int i=0; i<units.length; i++) {

            int unit = units[i];

            if(change/unit != 0) {
                res += change / unit;
                change %= unit;
            }
        }

        System.out.println(res);
    }

}
