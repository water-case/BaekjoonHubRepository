import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        res = Integer.MAX_VALUE;
        for(int i=0; i<M; i++) {
            move(1, i, map[0][i], -1);
        }

        System.out.println(res);
        br.close();
    }

    static int N, M, res;
    static int[] dely = {-1, 0, 1}; // 좌하우
    static int[][] map;

    private static void move(int x, int y, int sum, int direct) {
        if(x==N) {
            res = Math.min(res, sum);
            return;
        }

        for(int d=0; d<3; d++) {
            int dy = y + dely[d];

            if(dy<0 || dy>=M || direct==d) {
                continue;
            }

            move(x+1, dy, sum + map[x][dy], d);
        }
    }

}
