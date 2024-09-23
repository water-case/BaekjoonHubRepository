import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        while(N-->0) {
            int cal = Arrays.stream(br.readLine().replaceAll(" ","").split(""))
                            .mapToInt(s -> s.charAt(0)-64)
                            .sum();

            res.append(cal==100 ? "PERFECT LIFE" : cal)
                .append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
