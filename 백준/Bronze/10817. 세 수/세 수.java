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

    static PriorityQueue<Integer> pq = new PriorityQueue<>();
    static int res = 0;

    private static void solve() {
        pq.poll();
        res = pq.poll();
    }

    private static void init(BufferedReader br) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<3; i++) {
            int n = Integer.parseInt(st.nextToken());
            pq.offer(n);
        }
    }

}
