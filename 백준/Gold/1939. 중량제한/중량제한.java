import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        edgeList = new List[N];
        for(int i=0; i<N; i++) {
            edgeList[i] = new ArrayList<>();
        }
        while(M-->0) {
            st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken())-1;
            int B = Integer.parseInt(st.nextToken())-1;
            int C = Integer.parseInt(st.nextToken());

            edgeList[A].add(new Edge(B, C));
            edgeList[B].add(new Edge(A, C));
        }
        for(int i=0; i<N; i++) {
            Collections.sort(edgeList[i]);
        }

        st = new StringTokenizer(br.readLine(), " ");
        start = Integer.parseInt(st.nextToken())-1;
        end = Integer.parseInt(st.nextToken())-1;

        br.close();
    }

    static int N, start, end;
    static List<Edge>[] edgeList;

    private static void solve() {
        int res = 0;

        boolean[] v = new boolean[N];
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.offer(new Edge(start, Integer.MAX_VALUE));
        while(!pq.isEmpty()) {
            Edge now = pq.poll();

            if(now.end == end) {
                res = Math.max(res, now.price);
            }

            if(v[now.end]) {
                continue;
            }
            v[now.end] = true;

            for(Edge next : edgeList[now.end]) {
                pq.offer(new Edge(next.end, Math.min(now.price, next.price)));
            }
        }

        System.out.println(res);
    }

    static class Edge implements Comparable<Edge> {
        int end, price;

        public Edge(int end, int price) {
            this.end = end;
            this.price = price;
        }

        @Override
        public int compareTo(Edge o) {
            return -Integer.compare(price, o.price);
        }
    }

}
