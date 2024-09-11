import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int W = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int res = 0;
        st = new StringTokenizer(br.readLine(), " ");
        while(st.hasMoreTokens()) {
            int H = Integer.parseInt(st.nextToken());

            if(H>=W && H<=N) {
                res++;
            }
        }

        System.out.println(res);
        br.close();
    }

}
