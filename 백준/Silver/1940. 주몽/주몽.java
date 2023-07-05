import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        nArr = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .sorted()
                        .toArray();

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static int M;
    static int[] nArr;

    private static void solve() {
        int res = 0;

        int start = 0, end = nArr.length-1;
        while(start < end) {

            int cal = nArr[start] + nArr[end];

            if(cal == M) {
                res++;
                start++;
                end--;
                continue;
            }

            if(cal > M) {
                end--;
            } else {
                start++;
            }
        }

        System.out.println(res);
    }

}