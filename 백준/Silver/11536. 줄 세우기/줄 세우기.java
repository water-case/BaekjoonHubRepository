import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        names = new String[N];
        for(int i=0; i<N; i++) {
            names[i] = br.readLine();
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static int N;
    static String[] names;

    private static void solve() {
        String res = "";

        boolean chk = names[0].compareTo(names[1]) > 0;
        res = chk ? "DECREASING" : "INCREASING";
        for(int i=1; i<N-1; i++) {
            if(!chk == names[i].compareTo(names[i+1]) > 0) {
                res = "NEITHER";
                break;
            }
        }

        System.out.println(res);
    }

}
