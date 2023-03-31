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
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        g = new ArrayList[N];
        for(int i=0; i<N; i++) {
            g[i] = new ArrayList<>();
        }
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken())-1;
            int end = Integer.parseInt(st.nextToken())-1;
            int price = Integer.parseInt(st.nextToken());

            g[start].add(new Node(end, price));
            g[end].add(new Node(start, price));
        }

        br.close();
    }

    static int N, M, K;
    static List<Node>[] g;

    private static void solve() {
        long res = Long.MAX_VALUE;

        long[][] dist = new long[N][K+1];
        for(int i=0; i<N; i++) {
            Arrays.fill(dist[i], Long.MAX_VALUE);
        }

        PriorityQueue<Node> pq = new PriorityQueue<>();
        dist[0][0] = 0;
        pq.offer(new Node(0,0));

        while(!pq.isEmpty()) {
            Node now = pq.poll();

            if(now.price > dist[now.end][now.pcnt]) {
                continue;
            }

            for(Node next : g[now.end]) {
                if(now.pcnt+1<=K && dist[next.end][now.pcnt+1] > now.price) {
                    dist[next.end][now.pcnt+1] = now.price;
                    pq.offer(new Node(next.end, dist[next.end][now.pcnt+1], now.pcnt+1));
                }
                if(dist[next.end][now.pcnt] > dist[now.end][now.pcnt]+next.price) {
                    dist[next.end][now.pcnt] = dist[now.end][now.pcnt]+next.price;
                    pq.offer(new Node(next.end, dist[next.end][now.pcnt], now.pcnt));
                }
            }
        }

        for(int i=0; i<=K; i++) {
            res = Math.min(res, dist[N-1][i]);
        }
        System.out.println(res);
    }

    static class Node implements Comparable<Node> {
        int end, pcnt;
        long price;

        public Node(int end, long price) {
            this.end = end;
            this.price = price;
            this.pcnt = 0;
        }

        public Node(int end, long price, int pcnt) {
            this.end = end;
            this.price = price;
            this.pcnt = pcnt;
        }

        @Override
        public int compareTo(Node o) {
            return Long.compare(price, o.price);
        }
    }

}
