import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] CAR = new int[2][];
        for(int i=0; i<2; i++) {
            CAR[i] = Arrays.stream(br.readLine().split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray();
        }

        int res = 0;
        for(int i=0; i<3; i++) {
            int cal = CAR[1][i] - CAR[0][i];
            res += cal > 0 ? cal : 0;
        }

        System.out.println(res);
        br.close();
    }

}
