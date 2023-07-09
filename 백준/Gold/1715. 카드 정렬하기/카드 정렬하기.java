import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        pq = new PriorityQueue<>();

        int N = Integer.parseInt(br.readLine());
        while(N-->0) {
            pq.offer(Integer.parseInt(br.readLine()));
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static Queue<Integer> pq;

    private static void solve() {
        long res = 0;

        while(pq.size() > 1) {
            int now1 = pq.poll();
            int now2 = pq.poll();

            int cal = now1 + now2;
            res += cal;
            pq.offer(cal);
        }

        System.out.println(res);
    }

}
