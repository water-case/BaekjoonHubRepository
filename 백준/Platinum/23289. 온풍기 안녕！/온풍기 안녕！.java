import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        res = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        map = new int[R][C];
        fanList = new ArrayList<>();
        tempCheckList = new ArrayList<>();
        for(int i=0; i<R; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<C; j++) {
                int n = Integer.parseInt(st.nextToken());
                switch (n) {
                    case 0: break;
                    case 1: fanList.add(new FanPos(i,j,1)); break;
                    case 2: fanList.add(new FanPos(i,j,3)); break;
                    case 3: fanList.add(new FanPos(i,j,0)); break;
                    case 4: fanList.add(new FanPos(i,j,2)); break;
                    case 5: tempCheckList.add(new Pos(i, j)); break;
                }
            }
        }

        wallMap = new boolean[R][C][4];
        W = Integer.parseInt(br.readLine());
        for(int i=0; i<W; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken())-1;
            int y = Integer.parseInt(st.nextToken())-1;
            int t = Integer.parseInt(st.nextToken());

            if(t==0) {
                wallMap[x  ][y][0] = true;
                wallMap[x-1][y][2] = true;
            } else {
                wallMap[x][y  ][1] = true;
                wallMap[x][y+1][3] = true;
            }
        }
    }

    static int res;
    static int R,C,K,W;
    static int[] delx = {-1, 0, 1, 0}; // 상우하좌
    static int[] dely = { 0, 1, 0,-1}; // 상우하좌
    static int[][] heatd = {
            {1, 3},
            {0, 2},
            {1, 3},
            {0, 2}
    };
    static int[][] map;
    static ArrayList<FanPos> fanList;
    static ArrayList<Pos> tempCheckList;
    static boolean[][][] wallMap;

    private static void solve() {
        while(tempCheck()) {
            heating();
            tempControl();
            tempDrop();
            if(res++ == 100) {
                break;
            }
        }

        System.out.println(res);
    }

    private static void tempDrop() {
        for(int y=0; y<C; y++) {
            if(map[0][y] > 0) {
                map[0][y]--;
            }
            if(map[R-1][y] > 0) {
                map[R-1][y]--;
            }
        }

        for(int x=1; x<R-1; x++) {
            if(map[x][0] > 0) {
                map[x][0]--;
            }
            if(map[x][C-1] > 0) {
                map[x][C-1]--;
            }
        }

    }

    private static void tempControl() {
        int[][] tmap = new int[R][C];

        for(int i=0; i<R; i++) {
            for(int j=0; j<C; j++) {
                for(int d=1; d<=2; d++) {
                    int dx = i+delx[d];
                    int dy = j+dely[d];

                    if(dx<0 || dx>=R || dy<0 || dy>=C || wallMap[i][j][d]) {
                        continue;
                    }

                    if(map[i][j] > map[dx][dy]) {
                        int cal = (int) Math.floor((map[i][j] - map[dx][dy]) / 4);
                        tmap[dx][dy] += cal;
                        tmap[i][j] -= cal;
                    } else {
                        int cal = (int) Math.floor((map[dx][dy] - map[i][j]) / 4);
                        tmap[dx][dy] -= cal;
                        tmap[i][j] += cal;
                    }
                }
            }
        }

        for(int i=0; i<R; i++) {
            for(int j=0; j<C; j++) {
                map[i][j] += tmap[i][j];
            }
        }
    }

    private static void heating() {
        for(FanPos fp : fanList) {
            if(wallMap[fp.x][fp.y][fp.d]) {
                continue;
            }

            heatingDfs(fp.x, fp.y, fp.d, 5, new boolean[R][C]);
        }
    }

    private static void heatingDfs(int x, int y, int d, int val, boolean[][] v) {
        if(x<0 || x>=R || y<0 || y>=C) {
            return;
        }

        int dx = x+delx[d];
        int dy = y+dely[d];

        if(dx<0 || dx>=R || dy<0 || dy>=C || wallMap[x][y][d]) {
            return;
        }

        if(!v[x][y]) {
            map[dx][dy] += val;
            v[x][y] = true;
        }

        if(val==1) {
            return;
        }

        if(!wallMap[dx][dy][heatd[d][0]]) {
            heatingDfs(dx+delx[heatd[d][0]], dy+dely[heatd[d][0]], d, val-1, v);
        }
        heatingDfs(dx, dy, d, val-1, v);
        if(!wallMap[dx][dy][heatd[d][1]]) {
            heatingDfs(dx+delx[heatd[d][1]], dy+dely[heatd[d][1]], d, val-1, v);
        }
    }

    private static boolean tempCheck() {
        for(Pos p : tempCheckList) {
            if(map[p.x][p.y] < K) {
                return true;
            }
        }

        return false;
    }

    static class Pos {
        int x, y;

        public Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static class FanPos extends Pos {
        int d;

        public FanPos(int x, int y, int d) {
            super(x, y);
            this.d = d;
        }
    }

}
