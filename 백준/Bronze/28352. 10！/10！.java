import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        BigInteger bi = BigInteger.ONE;
        for(int i=2; i<=N; i++) {
            bi = bi.multiply(new BigInteger(String.valueOf(i)));
        }

        int weekSec = 7 * 24 * 60 * 60;

        System.out.println(bi.divide(new BigInteger(String.valueOf(weekSec))));
        br.close();
    }

}
