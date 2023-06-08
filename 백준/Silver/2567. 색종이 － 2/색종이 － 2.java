import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        pos = new int[N][2];
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            pos[i][0] = Integer.parseInt(st.nextToken());
            pos[i][1] = Integer.parseInt(st.nextToken());
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static int N, pos[][];
    static int[] delx = {-1, 0, 1, 0}; // 상우하좌
    static int[] dely = { 0, 1, 0,-1};

    private static void solve() {
        int res = 0;

        boolean[][] map = new boolean[101][101];
        for(int[] ia : pos) {
            for(int i=ia[0]; i<ia[0]+10; i++) {
                for(int j=ia[1]; j<ia[1]+10; j++) {
                    map[i][j] = true;
                }
            }
        }

        for(int i=1; i<=100; i++) {
            for(int j=1; j<=100; j++) {
                if(!map[i][j]) {
                    continue;
                }

                int cnt = 0;
                for(int d=0; d<4; d++) {
                    int dx = i+delx[d], dy = j+dely[d];
                    if(!map[dx][dy]) {
                        cnt++;
                    }
                }
                res += cnt;
            }
        }

        System.out.println(res);
    }

}
