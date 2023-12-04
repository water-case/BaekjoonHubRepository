import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int res = 0;
        int N = Integer.parseInt(br.readLine());
        int K = 1;
        while(N>0) {
            if(K > N) {
                K = 1;
            }

            N -= K;
            K++;
            res++;
        }

        System.out.println(res);
        br.close();
    }

}
