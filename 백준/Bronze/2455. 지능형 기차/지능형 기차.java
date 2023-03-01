import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        res = Integer.MIN_VALUE;
        subwayList = new ArrayList<>();

        for(int i=0; i<4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int[] subway = new int[2];
            subway[0] = Integer.parseInt(st.nextToken());
            subway[1] = Integer.parseInt(st.nextToken());
            subwayList.add(subway);
        }

        br.close();
    }

    static int res;
    static List<int[]> subwayList;

    private static void solve() {
        int now = 0;

        for(int[] subway : subwayList) {
            now -= subway[0];
            now += subway[1];
            res = Math.max(res, now);
        }

        System.out.println(res);
    }

}
