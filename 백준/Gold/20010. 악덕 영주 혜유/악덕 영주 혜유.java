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
        K = Integer.parseInt(st.nextToken());

        makeSet();
        edgeList = new ArrayList<>();
        mstList = new ArrayList[N];
        for(int i=0; i<N; i++) {
            mstList[i] = new ArrayList<>();
        }

        while(K-->0) {
            st = new StringTokenizer(br.readLine(), " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            edgeList.add(new Edge(a, b, c));
        }
        Collections.sort(edgeList);

        br.close();
    }

    static int N,K,max,start;
    static int[] parent;
    static List<Edge> edgeList;
    static List<Edge>[] mstList;

    private static void solve() {
        int res1 = 0, res2 = 0;

        res1 = mst();
        res2 = bigmst();

        System.out.println(res1);
        System.out.println(res2);
    }

    private static int bigmst() {
        max = Integer.MIN_VALUE;
        boolean[] visit = new boolean[N];
        visit[0] = true;
        dfs(0, 0, visit);

        max = Integer.MIN_VALUE;
        visit = new boolean[N];
        visit[start] = true;
        dfs(start, 0, visit);

        return max;
    }

    private static void dfs(int num, int sum, boolean[] v) {
        if(max < sum) {
            max = sum;
            start = num;
        }

        for(int i=0; i<mstList[num].size(); i++) {
            Edge next = mstList[num].get(i);
            if(!v[next.end]) {
                v[next.end] = true;
                dfs(next.end, sum+next.price, v);
            }
        }
    }

    private static int mst() {
        int res = 0;
        int cnt = 0;
        for(Edge e : edgeList) {
            if(!union(e.start, e.end)) {
                res += e.price;

                mstList[e.start].add(new Edge(e.start, e.end, e.price));
                mstList[e.end].add(new Edge(e.end, e.start, e.price));

                if(cnt++ == N-1) {
                    break;
                }
            }
        }
        return res;
    }

    private static void makeSet() {
        parent = new int[N];
        for(int i=0; i<N; i++) {
            parent[i] = i;
        }
    }

    public static int find(int a) {
        if(a==parent[a]) {
            return a;
        }

        return parent[a]=find(parent[a]);
    }

    public static boolean union(int a, int b) {
        a = find(a);
        b = find(b);

        if(find(a)==find(b)) {
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
