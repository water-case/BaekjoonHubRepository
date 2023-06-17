import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        S = Long.parseLong(br.readLine());

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static long S;

    private static void solve() {
        long res = 1;

        long cal = 0;
        while(true) {
            cal += res;
            if(cal >= S) {
                if(cal > S)
                    res--;
                break;
            }
            res++;
        }

        System.out.println(res);
    }

}
