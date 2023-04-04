import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        nums = new int[N];
        for(int i=0; i<N; i++) {
            nums[i] = Integer.parseInt(br.readLine())-1;
        }

        v = new boolean[N];
        ansList = new ArrayList<>();

        br.close();
    }

    static int N;
    static int[] nums;
    static boolean[] v;
    static List<Integer> ansList;

    private static void solve() {
        StringBuilder res = new StringBuilder();

        for(int i=0; i<N; i++) {
            if(!v[i]) {
                dfs(i, nums[i], new boolean[N]);
            }
        }

        Collections.sort(ansList);
        res.append(ansList.size()).append("\n");
        for(int i : ansList) {
            res.append(i).append("\n");
        }
        System.out.println(res.toString());
    }

    private static void dfs(int start, int next, boolean[] visit) {
        if(v[next] || visit[next]) {
            return;
        }

        if(start == next) {
            visit[next] = true;
            for(int i=0; i<N; i++) {
                if(visit[i]) {
                    v[i] = true;
                    ansList.add(i+1);
                }
            }
            return;
        }

        visit[next] = true;
        dfs(start, nums[next], visit);
    }

}
