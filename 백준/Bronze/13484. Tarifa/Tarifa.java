import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int res = X * (N+1);
        while(N-->0) {
            res -= Integer.parseInt(br.readLine());
        }

        System.out.println(res);
        br.close();
    }

}
