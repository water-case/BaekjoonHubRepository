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

        nums = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);

        br.close();
    }

    static int N, M;
    static int[] nums;
    static StringBuilder res;

    private static void solve() {
        res = new StringBuilder();

        for(int i=0; i<N; i++) {
            boolean[] v = new boolean[N];
            int[] ans = new int[M];
            v[i] = true;
            ans[0] = nums[i];
            dfs(i, 1, v, ans);
        }

        System.out.println(res.toString());
    }

    private static void dfs(int start, int cnt, boolean[] v, int[] ans) {
        if(cnt == M) {
            for(int i=0; i<M; i++) {
                res.append(ans[i]).append(" ");
            }
            res.append("\n");
            return;
        }

        for(int i=0; i<N; i++) {
            if(!v[i]) {
                v[i] = true;
                ans[cnt] = nums[i];
                dfs(i, cnt+1, v, ans);
                v[i] = false;
            }
        }
    }

}
