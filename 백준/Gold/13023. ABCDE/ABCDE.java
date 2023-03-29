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
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        edge = new List[N];
        for(int i=0; i<N; i++) {
            edge[i] = new ArrayList<>();
        }

        while(M-->0) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            edge[a].add(b);
            edge[b].add(a);
        }

        br.close();
    }

    static List<Integer>[] edge;

    private static void solve() {
        int res = 0;

        for(int i=0; i<edge.length; i++) {
            boolean[] v = new boolean[edge.length];
            v[i] = true;
            if(dfs(i, 1, v)) {
                res = 1;
            }
        }

        System.out.println(res);
    }

    private static boolean dfs(int i, int cnt, boolean[] v) {
        if(cnt==5) {
            return true;
        }

        for(Integer next : edge[i]) {
            if(!v[next]) {
                v[next]=true;
                if(dfs(next, cnt+1, v)) {
                    return true;
                }
                v[next]=false;
            }
        }

        return false;
    }

}
