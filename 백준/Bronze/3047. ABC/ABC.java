import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] nums = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();

        StringBuilder res = new StringBuilder();

        for(String s : br.readLine().split("")) {
            switch (s) {
                case "A": res.append(nums[0]); break;
                case "B": res.append(nums[1]); break;
                case "C": res.append(nums[2]); break;
            }

            res.append(" ");
        }

        System.out.println(res.toString());
        br.close();
    }

}
