import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N+1][M+1];

        for(int i=1; i<=N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=1; j<=M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static int N, M, map[][];
    static int[] delx = { 0,-1,-1}; // 좌 좌상 상
    static int[] dely = {-1,-1, 0}; // 좌 좌상 상


    private static void solve() {
        int res = 0;

        int[][] memo = new int[N+1][M+1];

        for(int i=1; i<=N; i++) {
            for(int j=1; j<=M; j++) {

                for(int d=0; d<3; d++) {

                    int dx = i + delx[d], dy = j + dely[d];

                    memo[i][j] = Math.max(memo[i][j], memo[dx][dy] + map[i][j]);
                }
            }
        }
        res = memo[N][M];

        System.out.println(res);
    }

}
