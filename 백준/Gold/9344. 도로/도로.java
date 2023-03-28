import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        tcList = new ArrayList<>();
        int T = Integer.parseInt(br.readLine());
        while(T-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken())-1;
            int q = Integer.parseInt(st.nextToken())-1;
            TestCase tc = new TestCase(N,M,p,q);


            while(M-->0) {
                st = new StringTokenizer(br.readLine(), " ");
                int u = Integer.parseInt(st.nextToken())-1;
                int v = Integer.parseInt(st.nextToken())-1;
                int w = Integer.parseInt(st.nextToken());

                tc.addEdge(new Edge(u, v, w));
            }

            tcList.add(tc);
        }

        br.close();
    }

    static List<TestCase> tcList;
    static int[] parent;

    private static void solve() {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<tcList.size(); i++) {
            sb.append(mst(tcList.get(i))).append("\n");
        }

        System.out.println(sb.toString());
    }

    private static String mst(TestCase tc) {
        String res = "NO";

        Collections.sort(tc.edgeList);
        makeSet(tc.N);

        int cnt = 0;
        for(Edge e : tc.edgeList) {
            if(!union(e.start, e.end)) {
                if((e.start == tc.p && e.end == tc.q) || (e.start == tc.q && e.end == tc.p)) {
                    res = "YES";
                }
                if(cnt++ == tc.N-1) break;
            }
        }

        return res;
    }

    private static void makeSet(int size) {
        parent = new int[size];
        for(int i=0; i<size; i++) {
            parent[i]=i;
        }
    }

    private static int find(int a) {
        if(a==parent[a]) return a;
        return parent[a] = find(parent[a]);
    }

    private static boolean union(int a, int b) {
        a = find(a);
        b = find(b);
        if(find(a) == find(b)) return true;
        parent[b] = a;
        return false;
    }

    static class TestCase {
        int N, M, p, q;

        List<Edge> edgeList;

        public TestCase(int n, int m, int p, int q) {
            N = n;
            M = m;
            this.p = p;
            this.q = q;
            edgeList = new ArrayList<>();
        }

        public void addEdge(Edge e) {
            edgeList.add(e);
        }
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
