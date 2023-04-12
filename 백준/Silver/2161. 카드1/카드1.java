import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        q = new ArrayDeque<>();
        for(int i=1; i<=N; i++) {
            q.offer(i);
        }

        br.close();
    }

    static Queue<Integer> q;

    private static void solve() {
        StringBuilder res = new StringBuilder();

        while(!q.isEmpty()) {
            res.append(q.poll()).append(" ");

            if(q.isEmpty()) {
                break;
            }
            q.offer(q.poll());
        }

        System.out.println(res.toString());
    }

}
