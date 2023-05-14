import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        maxPos = 0;
        minPos = Integer.MAX_VALUE;
        pList = new ArrayList<>();
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int g = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());

            pList.add(new Pos(g, x));
            minPos = Math.min(minPos, x);
            maxPos = Math.max(maxPos, x);
        }

        Collections.sort(pList);

        br.close();
    }

    static int N, K, maxPos, minPos;
    static List<Pos> pList;

    private static void solve() {
        int res = 0;

        int sum = 0, idx = 0, tidx = 0;
        while(pList.size() > idx) {
            Pos now = pList.get(idx);

            sum += now.g;

            while(now.x > pList.get(tidx).x + 2*K + 1) {
                sum -= pList.get(tidx).g;
                tidx++;
            }

            res = Math.max(res, sum);
            idx++;
        }

        System.out.println(res);
    }

    private static class Pos implements Comparable<Pos> {
        int g, x;

        public Pos(int g, int x) {
            this.g = g;
            this.x = x;
        }

        @Override
        public int compareTo(Pos o) {
            return Integer.compare(x, o.x);
        }
    }

}
