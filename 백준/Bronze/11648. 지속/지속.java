import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int res = 0;
        while(n>=10) {
            n = Arrays.stream(String.valueOf(n).split(""))
                    .mapToInt(Integer::parseInt)
                    .reduce(1, (a,b) -> a*b);

            res++;
        }

        System.out.println(res);
        br.close();
    }

}
