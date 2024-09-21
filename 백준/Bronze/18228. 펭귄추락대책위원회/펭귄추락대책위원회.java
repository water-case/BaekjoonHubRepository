import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int res = 0;

        int N = Integer.parseInt(br.readLine());
        int[] aArr = Arrays.stream(br.readLine().split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray();

        int min = Integer.MAX_VALUE;
        for(int a : aArr) {
            if(a == -1) {
                res += min;
                min = Integer.MAX_VALUE;
                continue;
            }

            min = Math.min(a, min);
        }
        res += min;

        System.out.println(res);
        br.close();
    }

}
