import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while(T-->0) {
            int n = Integer.parseInt(br.readLine());

            int Wn = IntStream.rangeClosed(1, n)
                                .map(i -> i*Tn(i))
                                .sum();

            res.append(Wn).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

    private static int Tn(int n) {
        return IntStream.rangeClosed(1, n+1)
                        .sum();
    }

}
