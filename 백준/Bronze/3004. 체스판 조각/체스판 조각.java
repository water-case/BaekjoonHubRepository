import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int res = 1, cnt = 1;
        for(int i=1; i<=N; i++) {
            if(i%2 == 0) {
                cnt++;
            }

            res += cnt;
        }

        System.out.println(res);
        br.close();
    }

}
