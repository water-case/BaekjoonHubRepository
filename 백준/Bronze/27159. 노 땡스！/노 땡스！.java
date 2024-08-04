import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int res = 0;

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int tmp = -1;
        while(N-->0) {
            int x = Integer.parseInt(st.nextToken());

            if(x-tmp > 1) {
                res += x;

            }

            tmp = x;
        }

        System.out.println(res);
        br.close();
    }

}
