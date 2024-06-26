import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int B = Integer.parseInt(br.readLine());
        int P = 5 * B - 400;

        StringBuilder res = new StringBuilder();
        res.append(P).append("\n")
            .append(P==100 ? 0 : (P<100 ? 1 : -1));

        System.out.println(res.toString());
        br.close();
    }

}
