import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        dotList = new ArrayList<>();
        int idx = 0;

        N = Integer.parseInt(br.readLine());
        makeSet();

        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            dotList.add(new Dot(x, y, idx++));
        }

        PriorityQueue<Edge> pq = new PriorityQueue<>();
        for(int i=0; i<N; i++) {
            for(int j=i+1; j<N; j++) {
                pq.offer(new Edge(i, j, distCalc(dotList.get(i), dotList.get(j))));
            }
        }

        int res = 0;
        while(!pq.isEmpty()) {
            Edge now = pq.poll();

            if(!union(now.a, now.b)) {
                res = Math.max(res, now.price);
            }
        }

        System.out.println(res);
        br.close();
    }

    static int N;
    static int[] parent;
    static List<Dot> dotList;

    private static void makeSet() {
        parent = IntStream.rangeClosed(0, N-1)
                .toArray();
    }

    private static int find(int a) {
        if(a == parent[a]) {
            return a;
        }
        return parent[a] = find(parent[a]);
    }

    private static boolean union(int a, int b) {
        a = find(a);
        b = find(b);
        if(find(a) == find(b)) {
            return true;
        }
        parent[b] = a;
        return false;
    }

    private static int distCalc(Dot a, Dot b) {
        return (a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y);
    }

    private static class Edge implements Comparable<Edge> {
        int a, b, price;

        public Edge(int a, int b, int price) {
            this.a = a;
            this.b = b;
            this.price = price;
        }

        @Override
        public int compareTo(Edge o) {
            return Integer.compare(price, o.price);
        }
    }

    private static class Dot {
        int x, y, idx;

        public Dot(int x, int y, int idx) {
            this.x = x;
            this.y = y;
            this.idx = idx;
        }
    }

}
