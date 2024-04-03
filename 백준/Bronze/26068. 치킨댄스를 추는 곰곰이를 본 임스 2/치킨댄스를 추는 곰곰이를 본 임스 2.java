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
        while(N-->0) {
            int x = Integer.parseInt(br.readLine().split("-")[1]);
            if(x <= 90) {
                res++;
            }
        }

        System.out.println(res);
        br.close();
    }

}
