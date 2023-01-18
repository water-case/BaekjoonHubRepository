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

    static String res;
    static int N;

    private static void solve() {
        StringBuilder sb = new StringBuilder();
        for(int i=N; i>0; i--) {
            for(int j=0; j<N-i; j++) {
                sb.append(" ");
            }
            for(int j=0; j<2*i-1; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        for(int i=2; i<=N; i++) {
            for(int j=0; j<N-i; j++) {
                sb.append(" ");
            }
            for(int j=0; j<2*i-1; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        res = sb.toString();
    }

    private static void init(BufferedReader br) throws Exception {
        N = Integer.parseInt(br.readLine());
    }

}
