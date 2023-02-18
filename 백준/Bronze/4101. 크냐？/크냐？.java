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
    static List<int[]> testCase;

    private static void solve() {
        StringBuilder sb = new StringBuilder();

        for(int[] ia : testCase) {
            String str = ia[0] > ia[1] ? "Yes" : "No";

            sb.append(str).append("\n");
        }

        res = sb.toString();
    }

    private static void init(BufferedReader br) throws Exception {
        testCase = new ArrayList<>();

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(a==0 && b==0) {
                break;
            }

            testCase.add(new int[] {a, b});
        }
    }

}
