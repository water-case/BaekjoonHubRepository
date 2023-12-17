import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .sum();

        System.out.println(sum);
        br.close();
    }

}
