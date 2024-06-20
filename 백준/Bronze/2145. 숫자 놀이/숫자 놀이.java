import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        String input = "";
        while(!(input = br.readLine()).equals("0")) {
            while(input.length()!=1) {
                int sum = Arrays.stream(input.split(""))
                                .mapToInt(Integer::parseInt)
                                .sum();

                input = String.valueOf(sum);
            }

            res.append(input).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
