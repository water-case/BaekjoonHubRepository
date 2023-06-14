import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static int N;
    static int[][] map;

    private static void solve() {
        int res = 0;

        while(N>1) {
            map = pooling(N/2, map);
            N /= 2;
        }

        res = map[0][0];
        System.out.println(res);
    }

    private static int[][] pooling(int n, int[][] map) {

        int[][] tmap = new int[n][n];

        int[] delx = {0, 0, 1, 1}; // 0,0 0,1 1,0 1,1
        int[] dely = {0, 1, 0, 1};

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
                for(int d=0; d<4; d++) {
                    int dx = 2*i + delx[d], dy = 2*j + dely[d];
                    second = Math.max(second, map[dx][dy]);
                    if(second > first) {
                        int tmp = second;
                        second = first;
                        first = tmp;
                    }
                }

                tmap[i][j] = second;
            }
        }

        return tmap;

    }

}
