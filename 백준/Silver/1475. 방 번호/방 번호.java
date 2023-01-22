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

    static int res;
    static int N;

    private static void solve() {
        int[] nums = new int[9];

        while(true) {
            int num = N%10;
            N/=10;

            if(num == 9) {
                num = 6;
            }
            nums[num]++;

            if(N==0) {
                break;
            }
        }
        nums[6]= (int) Math.ceil(nums[6]/2.0);

        for(int i=0; i<nums.length; i++) {
            res = Math.max(res, nums[i]);
        }
    }

    private static void init(BufferedReader br) throws Exception {
        N = Integer.parseInt(br.readLine());
    }

}
