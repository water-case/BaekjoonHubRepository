import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();

        System.out.println(res);
    }

    static int res, N, M, K;
    static Dice dice;
    static int[][] map;
    static int[] delx = {-1, 0, 1, 0}; // 상우하좌
    static int[] dely = { 0, 1, 0,-1};

    private static void solve() {
        while(K-->0) {
            dice.move(map);
            getScore();
        }
    }

    private static void getScore() {
        int x = dice.x;
        int y = dice.y;
        int num = map[x][y];

        dfs(x, y, num, new boolean[N][M]);
    }

    private static void dfs(int x, int y, int num, boolean[][] v) {
        if(v[x][y]) {
           return;
        }
        res += num;
        v[x][y] = true;

        for(int d=0; d<4; d++) {
            int dx = x+delx[d];
            int dy = y+dely[d];

            if(dx<0 || dx>=N || dy<0 || dy>=M || map[dx][dy]!=num || v[dx][dy]) {
                continue;
            }

            dfs(dx, dy, num, v);
        }
    }

    private static void init() throws Exception {
        res = 0;
        dice = new Dice();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    private static class Dice {
        int d, x, y;
        int[] dice;

        public Dice() {
            d = 1;
            x = 0;
            y = 0;
            dice = new int[] { 1, 2, 3, 4, 5, 6}; // top, back, right, left, front, bottom
        }

        public void move(int[][] map) {
            int dx = x + delx[d];
            int dy = y + dely[d];

            if(dx<0 || dx>=N || dy<0 || dy>=M) {
                d = (d+2)%4;
                dx = x + delx[d];
                dy = y + dely[d];
            }

            moveDice(d);

            int bottomNum = dice[5];

            if(bottomNum > map[dx][dy]) {
                d = (d+1)%4;
            } else if(bottomNum < map[dx][dy]) {
                d = (d+3)%4;
            }

            x = dx;
            y = dy;
        }

        private void moveDice(int d) {
            int[] tDice = dice.clone();

//            dice = new int[] { 1, 2, 3, 4, 5, 6}; // top, back, right, left, front, bottom
            switch(d) {
                case 0: // 상
                    dice[0] = tDice[4];
                    dice[1] = tDice[0];
                    dice[4] = tDice[5];
                    dice[5] = tDice[1];
                    break;
                case 1: // 우
                    dice[0] = tDice[3];
                    dice[2] = tDice[0];
                    dice[3] = tDice[5];
                    dice[5] = tDice[2];
                    break;
                case 2: // 하
                    dice[0] = tDice[1];
                    dice[1] = tDice[5];
                    dice[4] = tDice[0];
                    dice[5] = tDice[4];
                    break;
                case 3: // 좌
                    dice[0] = tDice[2];
                    dice[2] = tDice[5];
                    dice[3] = tDice[0];
                    dice[5] = tDice[3];
                    break;
            }
        }
    }

}
