import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while(T-->0) {
            int N = Integer.parseInt(br.readLine());
            int cal = 0;

            while(N-->0) {
                int max = Arrays.stream(br.readLine().split(" "))
                                .mapToInt(Integer::parseInt)
                                .max()
                                .getAsInt();

                cal += max < 0 ? 0 : max;
            }
            res.append(cal)
                .append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
