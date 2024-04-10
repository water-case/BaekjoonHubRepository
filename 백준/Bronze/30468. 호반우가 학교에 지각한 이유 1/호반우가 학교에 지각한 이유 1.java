import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<4; i++) {
            sum += Integer.parseInt(st.nextToken());
        }

        int N = Integer.parseInt(st.nextToken()) * 4;

        System.out.println(N-sum >= 0 ? N-sum : 0);
        br.close();
    }

}
