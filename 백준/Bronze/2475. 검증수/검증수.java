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
    static ArrayList<Integer> nList;

    private static void solve() {
        for(int n : nList) {
            res += Math.pow(n, 2);
        }
        res %= 10;
    }

    private static void init(BufferedReader br) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        nList = new ArrayList<>();
        while(st.hasMoreTokens()) {
            int n = Integer.parseInt(st.nextToken());
            nList.add(n);
        }
    }

}
