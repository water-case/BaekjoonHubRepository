import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static final String[] GROUP_NAME = {"PROBRAIN", "GROW", "ARGOS", "ADMIN", "ANT", "MOTION", "SPG", "COMON", "ALMIGHTY"};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String res = "";

        int N = Integer.parseInt(br.readLine());
        int max = Integer.MIN_VALUE;
        for(int i=0; i<9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<N; j++) {
                int K = Integer.parseInt(st.nextToken());
                if(K > max) {
                    res = GROUP_NAME[i];
                    max = K;
                }
            }
        }

        System.out.println(res);
        br.close();
    }

}
