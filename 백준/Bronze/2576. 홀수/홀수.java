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
    static List<Integer> numList;

    private static void solve() {
        if(numList.isEmpty()) {
            res = "-1";
            return;
        }

        int sum = 0;
        int min = Integer.MAX_VALUE;

        for(int i : numList) {
            sum += i;
            min = Math.min(min, i);
        }

        res = sum + "\n" + min;

    }

    private static void init(BufferedReader br) throws Exception {
        res = "";
        numList = new ArrayList<>();

        int idx = 7;
        while(idx-->0) {
            int n = Integer.parseInt(br.readLine());
            if(n%2 != 0) {
                numList.add(n);
            }
        }
    }

}
