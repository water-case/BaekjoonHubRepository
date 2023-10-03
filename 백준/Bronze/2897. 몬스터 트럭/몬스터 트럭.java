import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        map = new char[R][];
        for(int i=0; i<R; i++) {
            map[i] = br.readLine().toCharArray();
        }

        resArr = new int[5];
        for(int i=0; i<R; i++) {
            for(int j=0; j<C; j++) {
                isParkingAvailable(i, j);
            }
        }

        for(int res : resArr) {
            System.out.println(res);
        }
        br.close();
    }

    static int R, C;
    static char[][] map;
    static int[] resArr;
    static int[] delx = {0, 0, 1, 1};
    static int[] dely = {0, 1, 0, 1};

    private static void isParkingAvailable(int i, int j) {
        int cnt = 0;
        for(int d=0; d<4; d++) {
            int dx = i + delx[d], dy = j + dely[d];

            if(dx<0 || dx>=R || dy<0 || dy>=C || map[dx][dy]=='#') {
                return;
            }

            if(map[dx][dy]=='X') {
                cnt++;
            }
        }

        resArr[cnt]++;
    }

}
