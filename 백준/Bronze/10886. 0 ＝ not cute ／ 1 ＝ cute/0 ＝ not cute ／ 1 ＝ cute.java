import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();

        System.out.println(res);
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        nums = new ArrayList<>();
        while(N-->0) {
            nums.add(Integer.parseInt(br.readLine()));
        }

        br.close();
    }

    static String res;
    static int N;
    static List<Integer> nums;

    private static void solve() {
        int ycnt=0, ncnt=0;

        for(int i : nums) {
            if(i==1) {
                ycnt++;
            } else {
                ncnt++;
            }
        }

        res = ycnt > ncnt ? "Junhee is cute!" : "Junhee is not cute!";
    }

}
