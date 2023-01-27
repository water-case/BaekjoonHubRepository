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
    static String word;

    private static void solve() {
        res = word.length();
    }

    private static void init(BufferedReader br) throws Exception {
        word = br.readLine();
    }

}
