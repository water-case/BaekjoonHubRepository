import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String left = input.substring(0, input.length()/2);
        String right = input.substring(input.length()/2, input.length());

        int lSum = Arrays.stream(left.split("")).mapToInt(Integer::parseInt).sum();
        int rSum = Arrays.stream(right.split("")).mapToInt(Integer::parseInt).sum();

        System.out.println(lSum == rSum ? "LUCKY" : "READY");
        br.close();
    }

}
