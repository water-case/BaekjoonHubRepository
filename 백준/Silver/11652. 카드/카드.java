import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        pq = new PriorityQueue<>();

        int N = Integer.parseInt(br.readLine());
        while(N-->0) {
            pq.offer(Long.parseLong(br.readLine()));
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static Queue<Long> pq;

    private static void solve() {
        long res = 0;

        int cnt = 0, mcnt = 0;
        long idx = 0;
        while(!pq.isEmpty()) {
            long now = pq.poll();

            if(now != idx) {
                if(cnt > mcnt) {
                    res = idx;
                    mcnt = cnt;
                }

                idx = now;
                cnt = 0;
            }

            cnt++;
        }
        if(cnt > mcnt) {
            res = idx;
        }

        System.out.println(res);
    }

}
