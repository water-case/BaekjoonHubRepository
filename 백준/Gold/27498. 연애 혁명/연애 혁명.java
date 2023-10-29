import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        makeSet();

        List<Edge> edgeList = new ArrayList<>();
        while(M-->0) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int price = Integer.parseInt(st.nextToken());
            int success = Integer.parseInt(st.nextToken());

            if(success == 0) {
                edgeList.add(new Edge(start, end, price));
            } else {
                union(start, end);
            }
        }

        Collections.sort(edgeList, Collections.reverseOrder());

        int res = 0;
        for(Edge e : edgeList) {
            if(union(e.start, e.end)) {
                res += e.price;
            }
        }

        System.out.println(res);
        br.close();
    }

    static int N, M;
    static int[] parent;

    private static void makeSet() {
        parent = IntStream.rangeClosed(0, N)
                .toArray();
    }

    private static int find(int a) {
        if(a==parent[a]) {
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

    static class Edge implements Comparable<Edge> {
        int start, end, price;

        public Edge(int start, int end, int price) {
            this.start = start;
            this.end = end;
            this.price = price;
        }

        @Override
        public int compareTo(Edge o) {
            return Integer.compare(price, o.price);
        }
    }

}
