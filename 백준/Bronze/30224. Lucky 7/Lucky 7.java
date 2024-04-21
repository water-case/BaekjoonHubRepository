import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int res = 0;
        int N = Integer.parseInt(br.readLine());
        if(String.valueOf(N).contains("7")) {
            res = N%7 != 0 ? 2 : 3;
        } else {
            res = N%7 != 0 ? 0 : 1;
        }

        System.out.println(res);
        br.close();
    }

}
