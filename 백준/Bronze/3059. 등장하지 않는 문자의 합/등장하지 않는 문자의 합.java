import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while(T-->0) {
            char[] sArr =
                    Arrays.stream(br.readLine().split(""))
                            .distinct()
                            .sorted()
                            .collect(Collectors.joining())
                            .toCharArray();

            int sum = IntStream.rangeClosed(65,90).sum();

            for(char c : sArr) {
                sum -= c;
            }

            res.append(sum)
                .append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
