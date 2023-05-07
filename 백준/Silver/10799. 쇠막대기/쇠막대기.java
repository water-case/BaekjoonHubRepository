import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        input = br.readLine().split("");

        br.close();
    }

    static String[] input;

    private static void solve() {
        int res = 0;

        int cnt = 0;
        for(int i=0; i<input.length; i++) {
            if("(".equals(input[i])) {
                if(")".equals(input[i+1])) {
                    i++;
                    res += cnt;
                } else {
                    cnt++;
                }
            } else if(")".equals(input[i])) {
                res++;
                cnt--;
            }
        }

        System.out.println(res);
    }

}
