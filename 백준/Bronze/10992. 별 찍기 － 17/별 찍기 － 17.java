import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
    }

    static int N;

    private static void solve() {
        StringBuilder sb = new StringBuilder();

        if(N>1) {
            for(int i=0; i<N-1; i++) {
                sb.append(" ");
            }
            sb.append("*").append("\n");

            for(int i=0; i<N-2; i++) {
                for(int j=0; j<N-i-2; j++) {
                    sb.append(" ");
                }
                sb.append("*");
                for(int j=0; j<i*2+1; j++) {
                    sb.append(" ");
                }
                sb.append("*").append("\n");
            }
        }

        for(int i=0; i<2*N-1; i++) {
             sb.append("*");
        }

        System.out.println(sb.toString());
    }

}
