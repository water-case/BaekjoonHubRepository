import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        S = br.readLine();
        i = Integer.parseInt(br.readLine());

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static String S;
    static int i;

    private static void solve() {
        System.out.println(S.charAt(i-1));
    }

}
