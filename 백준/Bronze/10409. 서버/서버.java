import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int res = 0;

        st = new StringTokenizer(br.readLine(), " ");
        while(N-->0) {
            int n = Integer.parseInt(st.nextToken());
            if(T>=n) {
                res++;
                T-=n;
            } else {
                break;
            }
        }

        System.out.println(res);
        br.close();
    }

}
