import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] sArr = new int[8];
        for(int i=0; i<8; i++) {
            sArr[i] = Integer.parseInt(br.readLine());
        }

        int res = Integer.MIN_VALUE;
        int sum = sArr[4] + sArr[5] + sArr[6] + sArr[7];
        for(int i=0; i<8; i++) {
            sum += sArr[i] - sArr[(i+4) % 8];

            res = Math.max(res, sum);
        }

        System.out.println(res);
        br.close();
    }

}
