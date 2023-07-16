
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 주어진 조건
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Long.parseLong(st.nextToken());
        P = Long.parseLong(st.nextToken());
        Q = Long.parseLong(st.nextToken());

        map = new HashMap<>();
        map.put(0L, 1L);

        System.out.println(dp(N));
        br.close();
    }

    static long N, P, Q;
    static Map<Long, Long> map;

    private static long dp(long n) {
        long res = 0L;

        if(map.containsKey(n)) {
            res = map.get(n);
        } else {
            res = dp((long) (Math.floor(n/P))) + dp((long) Math.floor(n/Q));
        }

        map.put(n, res);

        return res;
    }

}
