import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        init(br);
        solve();

        System.out.println(res);
        br.close();
    }

    static String res;
    static List<Integer> nums;

    private static void solve() {
        StringBuilder sb = new StringBuilder();

        Collections.sort(nums);
        for(int n : nums) {
            sb.append(n).append(" ");
        }

        res = sb.toString();
    }

    private static void init(BufferedReader br) throws Exception {
        nums = new ArrayList<>();
        res = "";

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while(st.hasMoreTokens()) {
            int n = Integer.parseInt(st.nextToken());
            nums.add(n);
        }
    }

}
