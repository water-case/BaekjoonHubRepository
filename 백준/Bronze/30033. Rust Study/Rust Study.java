import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int res = 0;
        for(int i=0; i<N; i++) {
            res += Integer.parseInt(st2.nextToken()) >= Integer.parseInt(st1.nextToken()) ? 1 : 0;
        }

        System.out.println(res);
        br.close();
    }

}
