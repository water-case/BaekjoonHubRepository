import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int res = Arrays.stream(br.readLine().split(" "))
                        .map(Integer::parseInt)
                        .sorted(Comparator.reverseOrder())
                        .findFirst()
                        .get();

        System.out.println(res);
        br.close();
    }

}
