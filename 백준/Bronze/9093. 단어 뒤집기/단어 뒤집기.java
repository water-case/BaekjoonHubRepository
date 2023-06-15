import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        testCase = new ArrayList<>();

        T = Integer.parseInt(br.readLine());
        while(T-->0) {
            testCase.add(br.readLine());
        }

        br.close();
    }

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    static int T;
    static List<String> testCase;

    private static void solve() {
        StringBuilder res = new StringBuilder();

        for(String s : testCase) {
            String[] sa = s.split(" ");

            for(String ss : sa) {
                String[] ssa = ss.split("");

                for(int i=ssa.length-1; i>=0; i--) {
                    res.append(ssa[i]);
                }
                res.append(" ");
            }

            res.append("\n");
        }

        System.out.println(res);
    }

}
