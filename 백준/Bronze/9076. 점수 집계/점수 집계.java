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
            int[] nums = Arrays.stream(br.readLine().split(" "))
                                .mapToInt(Integer::parseInt)
                                .sorted()
                                .toArray();

            if(Math.abs(nums[1]-nums[3]) >= 4) {
                res.append("KIN").append("\n");
                continue;
            }

            int sum = 0;
            for(int i=1; i<4; i++) {
                sum += nums[i];
            }
            res.append(sum).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
