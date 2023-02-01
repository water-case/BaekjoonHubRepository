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

        for(int i=0; i<N-1; i++) {
            for(int j=N-1; j>i; j--) {
                sb.append(" ");
            }
            for(int j=0; j<=i*2; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        for(int i=1; i<2*N; i++) {
            sb.append("*");
        }
        sb.append("\n");

        for(int i=N-1; i>0; i--) {
            for(int j=N; j>i; j--) {
                sb.append(" ");
            }
            for(int j=0; j<=(i-1)*2; j++) {
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
