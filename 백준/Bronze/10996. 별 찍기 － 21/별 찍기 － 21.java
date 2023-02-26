import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();

        System.out.println(res);
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        res = "";
        N= Integer.parseInt(br.readLine());

        br.close();
    }

    static String res;
    static int N;

    private static void solve() {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<N; i++) {
            if(i%2==0) {
                sb.append("*");
            } else {
                sb.append(" ");
            }
        }

        sb.append("\n");

        for(int i=0; i<N; i++) {
            if(i%2==0) {
                sb.append(" ");
            } else {
                sb.append("*");
            }
        }

        sb.append("\n");

        for(int i=0; i<N; i++) {
            res += sb.toString();
        }
    }

}
