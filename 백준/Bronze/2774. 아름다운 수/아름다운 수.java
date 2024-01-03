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
            long cnt = Arrays.stream(br.readLine().split(""))
                            .distinct()
                            .count();

            res.append(cnt)
                .append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
