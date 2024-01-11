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
            String[] carNum = br.readLine().split("-");

            int[] frontArr = Arrays.stream(carNum[0].split(""))
                    .mapToInt(str -> str.charAt(0) - 65)
                    .toArray();

            int front = frontArr[0]*(int)Math.pow(26, 2) + frontArr[1]*(int)Math.pow(26, 1) + frontArr[2];
            int back = Integer.parseInt(carNum[1]);

            res.append(Math.abs(front-back) > 100 ? "not " : "")
                .append("nice\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
