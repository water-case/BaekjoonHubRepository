import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        init(br);

        game();

        System.out.println(res);
        br.close();
    }

    static int N, M, res;
    static int[] delx = {-1, 0, 1, 0};
    static int[] dely = { 0, 1, 0,-1};
    static int[][] map;
    static boolean[][] v;

    private static void game() {
        while(true) {
            if(!searchBlockAndRemove()) {
                break;
            }
            gravity();
            counterclockwiseRotate();
            gravity();
        }
    }

    private static void counterclockwiseRotate() {
        int[][] tmap = new int[N][N];

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                tmap[N-j-1][i] = map[i][j];
            }
        }

        map = tmap;
    }

    private static void gravity() {
        for(int i=N-1; i>=0; i--) {
            for(int j=0; j<N; j++) {
                if(map[i][j] != -2) {
                    continue;
                }

                for(int k=i-1; k>=0; k--) {
                    if(map[k][j] == -1) {
                         break;
                    }
                    if(map[k][j] != -2) {
                        map[i][j] = map[k][j];
                        map[k][j] = -2;
                        break;
                    }
                }
            }
        }

    }

    private static boolean searchBlockAndRemove() {
        PriorityQueue<Block> pq = new PriorityQueue<>();
        v = new boolean[N][N];

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(map[i][j] == -1 || map[i][j] == -2 || map[i][j] == 0 || v[i][j]) {
                    continue;
                }

                Block block = new Block(map[i][j], i, j, 0, 0);
                searchBlock(block, i, j, map[i][j], new boolean[N][N]);

                if(block.totalCnt<2) {
                    continue;
                }

                pq.offer(block);
            }
        }

        if(pq.isEmpty()) {
            return false;
        }

        Block removeBlock = pq.poll();
        res += Math.pow(removeBlock.totalCnt, 2);
        removeBlock(removeBlock.x, removeBlock.y, removeBlock.n);
        return true;
    }

    private static void removeBlock(int x, int y, int color) {
        map[x][y] = -2;

        for(int d=0; d<4; d++) {
            int dx = x+delx[d], dy = y+dely[d];
            if(!validation(dx, dy) || map[dx][dy] == -2 || map[dx][dy] == -1 || (map[dx][dy]!=0 && map[dx][dy]!=color)) {
                continue;
            }
            removeBlock(dx, dy, color);
        }
    }

    private static void searchBlock(Block block, int x, int y, int color, boolean[][] nowV) {
        nowV[x][y] = true;
        if(map[x][y] == 0) {
            block.addRainbowBlock();
        } else if(map[x][y] == color) {
            block.addBlock();
            v[x][y] = true;
        }

        for(int d=0; d<4; d++) {
            int dx = x+delx[d], dy = y+dely[d];
            if(!validation(dx, dy) || nowV[dx][dy] || map[dx][dy]==-1 || (map[dx][dy]!=0 && map[dx][dy]!=color)) {
                 continue;
            }
            searchBlock(block, dx, dy, color, nowV);
        }
    }

    private static void init(BufferedReader br) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][N];
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    private static boolean validation(int x, int y) {
        if(x<0 || x>=N || y<0 || y>=N) {
            return false;
        }
        return true;
    }

    static class Block implements Comparable<Block> {
        public int n, x, y, rainbowCnt, totalCnt;


        public Block(int n,int x, int y, int rainbowCnt, int totalCnt) {
            this.n = n;
            this.x = x;
            this.y = y;
            this.rainbowCnt = rainbowCnt;
            this.totalCnt = totalCnt;
        }

        public void addRainbowBlock() {
            rainbowCnt++;
            totalCnt++;
        }

        public void addBlock() {
            totalCnt++;
        }

        @Override
        public int compareTo(Block o) {
            if(totalCnt != o.totalCnt) {
                return -Integer.compare(totalCnt, o.totalCnt);
            }

            if(rainbowCnt != o.rainbowCnt) {
                return -Integer.compare(rainbowCnt, o.rainbowCnt);
            }

            if(x != o.x) {
                return -Integer.compare(x, o.x);
            }

            return -Integer.compare(y, o.y);
        }
    }

}
