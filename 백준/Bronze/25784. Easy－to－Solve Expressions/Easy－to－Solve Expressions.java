import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int res = 0;

        int[] nums = Arrays.stream(br.readLine().split(" "))
                            .mapToInt(Integer::parseInt)
                            .sorted()
                            .toArray();

        res = nums[0]+nums[1] == nums[2] ? 1 :
                nums[0]*nums[1] == nums[2] ? 2 : 3;

        System.out.println(res);
        br.close();
    }

}
