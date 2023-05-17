import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        map = new int[n][n];

        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                min = Math.min(min, map[i][j]);
                max = Math.max(max, map[i][j]);
            }
        }

        br.close();
    }

    static int n, map[][];
    static int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
    static int[] delx = {0, 1, 0,-1}; // 우하좌상
    static int[] dely = {1, 0,-1, 0};

    private static void solve() {
        int res = Integer.MAX_VALUE;

        int start = 0, end = 200;
        while(start<=end) {
            int mid = (start + end) / 2;

            boolean success = false;

            for(int i=min; i<=max; i++) {
                if(i>map[0][0] || i+mid<map[0][0]) {
                    continue;
                }

                if(bfs(i, i+mid)){
                    success = true;
                    break;
                }
            }

            if(success) {
                res = Math.min(res, mid);
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        System.out.println(res);
    }

    private static boolean bfs(int min, int max) {
        Queue<Pos> q = new ArrayDeque<>();
        q.offer(new Pos(0, 0));
        boolean[][] v = new boolean[n][n];
        v[0][0] = true;

        while(!q.isEmpty()) {
            Pos now = q.poll();
            int x = now.x, y=now.y;

            if(x == n-1 && y == n-1) {
                return true;
            }

            for(int d=0; d<4; d++) {
                int dx = x+delx[d], dy = y+dely[d];

                if(dx<0 || dx>=n || dy<0 || dy>=n
                        || v[dx][dy] || map[dx][dy]<min || map[dx][dy]>max) {
                    continue;
                }

                v[dx][dy] = true;
                q.offer(new Pos(dx, dy));
            }
        }

        return false;
    }

    private static class Pos {
        int x, y;

        public Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}
