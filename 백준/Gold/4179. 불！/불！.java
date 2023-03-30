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
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        fireList = new ArrayList<>();
        jihoonList = new ArrayList<>();
        map = new char[R][C];
        for(int i=0; i<R; i++) {
            map[i] = br.readLine().toCharArray();
            for(int j=0; j<C; j++) {
                if(map[i][j] == 'J') {
                    jihoonList.add(new Pos(i, j));
                } else if(map[i][j] == 'F') {
                    fireList.add(new Pos(i, j));
                }
            }
        }

        br.close();
    }

    static int R,C;
    static int[] delx = {-1, 0, 1, 0};
    static int[] dely = { 0, 1, 0,-1};
    static List<Pos> jihoonList;
    static List<Pos> fireList;
    static char[][] map;


    private static void solve() {
        int res = 0;

        // 불이 먼저 이동한 후 지훈이 이동
        do {
            if(jihoonList.isEmpty()) {
                res=0;
                break;
            }
            res++;
            fireMove();
        } while (!jihoonMove());

        System.out.println(res==0 ? "IMPOSSIBLE" : res);
    }

    private static boolean jihoonMove() {
        List<Pos> jihoonList2 = new ArrayList<>();
        boolean[][] v = new boolean[R][C];

        for(Pos jihoon : jihoonList) {
            for(int d=0; d<4; d++) {
                int dx=jihoon.x+delx[d], dy= jihoon.y+dely[d];
                if(dx<0 || dx>=R || dy<0 || dy>=C) {
                    return true;
                }
                if(map[dx][dy]=='#' || map[dx][dy]=='F' || map[dx][dy]=='J' || v[dx][dy]) {
                    continue;
                }
                if(map[dx][dy]=='.') {
                    map[dx][dy] = 'J';
                }
                v[dx][dy] = true;
                jihoonList2.add(new Pos(dx, dy));
            }
        }
        jihoonList = jihoonList2;

        return false;
    }

    private static void fireMove() {
        List<Pos> fireList2 = new ArrayList<>();
        boolean[][] v = new boolean[R][C];

        for(Pos fire : fireList) {
            for(int d=0; d<4; d++) {
                int dx=fire.x+delx[d], dy=fire.y+dely[d];
                if(dx<0 || dx>=R || dy<0 ||dy>=C || map[dx][dy]=='#' || map[dx][dy]=='F' || v[dx][dy]) {
                    continue;
                }
                v[dx][dy] = true;
                map[dx][dy] = 'F';
                fireList2.add(new Pos(dx, dy));
            }
        }

        fireList = fireList2;
    }

    static class Pos {
        int x, y;

        public Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}
