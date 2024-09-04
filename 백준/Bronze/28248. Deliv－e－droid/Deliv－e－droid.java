import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int P = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int res = (50*P) - (10*C) + (P>C ? 500 : 0);
        System.out.println(res);
        br.close();
    }

}
