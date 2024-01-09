import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    static String[] alpha = Arrays.stream("ABCDEFGHIJKL".split(""))
                                    .toArray(String[]::new);

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int standard = (N+56) % 60;

        System.out.println(alpha[standard%12] + standard%10);
        br.close();
    }

}
