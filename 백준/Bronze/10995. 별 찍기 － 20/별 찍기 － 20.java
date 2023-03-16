import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        br.close();
    }

    static int N;


    private static void solve() {
        StringBuilder sb = new StringBuilder();

        boolean startCheck = false, betweenCheck = false;
        for(int i=0; i<N; i++) {
            if(startCheck) {
                sb.append(" ");
            }

            for(int j=0; j<N*2; j++) {
                if(betweenCheck) {
                    sb.append(" ");
                } else {
                    sb.append("*");
                }
                betweenCheck = !betweenCheck;
            }

            sb.append("\n");
            startCheck = !startCheck;
        }

        System.out.println(sb.toString());
    }

}
