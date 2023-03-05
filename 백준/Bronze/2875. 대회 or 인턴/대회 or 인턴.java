import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
    }

    static int N,M,K;

    private static void solve() {
        int res = 0;

        int maxTeam = Math.min(M, N/2);

        int boyAvailable = M - maxTeam;
        int girlAvailable = N - (maxTeam*2);

        int available = boyAvailable + girlAvailable;
        if(K > available) {
            res = maxTeam - (int) (Math.ceil((K-available)/3.0));
        } else {
            res = maxTeam;
        }

        System.out.println(res);
    }

}
