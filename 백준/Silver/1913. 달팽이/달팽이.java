import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        pos = Integer.parseInt(br.readLine());

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static int N, pos;
    static int[] delx = {-1, 0, 1, 0}; // 상우하좌
    static int[] dely = { 0, 1, 0,-1}; // 상우하좌

    private static void solve() {
        StringBuilder res = new StringBuilder();

        int[][] map = new int[N][N];
        int x = N/2, y = N/2, px = -1, py = -1, idx = 1, d = 0, dcnt = 1, cnt = 0;
        boolean dchk = false;

        while(x>=0 && y>=0) {

            if(idx == pos) {
                px = x+1;
                py = y+1;
            }

            map[x][y] = idx++;

            x += delx[d];
            y += dely[d];

            cnt++;
            if(cnt == dcnt) {

                if(dchk) {
                    dcnt++;
                }

                dchk = !dchk;
                d = (d+1)%4;
                cnt = 0;
            }
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                res.append(map[i][j]).append(" ");
            }
            res.append("\n");
        }
        res.append(px).append(" ").append(py);

        System.out.println(res);
    }

}
