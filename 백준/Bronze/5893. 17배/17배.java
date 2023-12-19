import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger N =
                new BigInteger(br.readLine(), 2)
                        .multiply(new BigInteger("17"));
        System.out.println(N.toString(2));
        br.close();
    }

}
