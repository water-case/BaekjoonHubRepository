import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String X = br.readLine();

        BigInteger bX = X.charAt(0) != '0' ? new BigInteger(X)
                        : X.charAt(1) != 'x' ? new BigInteger(X.substring(1, X.length()), 8)
                            : new BigInteger(X.substring(2, X.length()), 16);

        System.out.println(bX.toString(10));

        br.close();
    }

}
