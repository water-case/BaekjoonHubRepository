import java.io.*;
import java.util.*;

public class Main {

    static int[] delx = {-1, 0, 1, 0};
    static int[] dely = { 0, 1, 0,-1};

    static int N, Q, L, mSize;
    static int[][] map;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        init(br, st);

        st = new StringTokenizer(br.readLine(), " ");
        while(Q-->0) {
            int L = Integer.parseInt(st.nextToken());

            fireStorm(L);
            iceCheck();
        }

        System.out.println(iceSum());
        System.out.println(iceCnt());
        br.close();
    }

    private static int iceCnt() {
        int res = 0;
        boolean[][] visit = new boolean[mSize][mSize];

        for(int i=0; i<mSize; i++) {
            for(int j=0; j<mSize; j++) {
                if(!visit[i][j] && map[i][j] != 0) {
                    res = Math.max(res, iceCntDfs(i, j, visit));
                }
            }
        }

        return res;
    }

    private static int iceCntDfs(int x, int y, boolean[][] visit) {
        int res = 0;

        for(int d=0; d<4; d++) {
            int dx = x+delx[d], dy = y+dely[d];
            if(dx<0 || dx>=mSize || dy<0 || dy>=mSize || visit[dx][dy] || map[dx][dy]==0) {
                continue;
            }

            visit[dx][dy]=true;
            res += iceCntDfs(dx, dy, visit);
            res++;
        }

        return res;
    }

    private static int iceSum() {
        int res = 0;

        for(int i=0; i<mSize; i++) {
            for(int j=0; j<mSize; j++) {
                res += map[i][j];
            }
        }

        return res;
    }

    private static void iceCheck() {
        boolean[][] minusPos = new boolean[mSize][mSize];

        for(int i=0; i<mSize; i++) {
            for(int j=0; j<mSize; j++) {
                if(map[i][j] == 0) {
                    continue;
                }

                int cnt = 0;
                for(int d=0; d<4; d++) {
                    int dx = i+delx[d], dy = j+dely[d];
                    if(dx<0 || dx>=mSize || dy<0 || dy>=mSize || map[dx][dy]==0) {
                        continue;
                    }
                    cnt++;
                }

                if(cnt<3) {
                    minusPos[i][j] = true;
                }
            }
        }

        for(int i=0; i<mSize; i++) {
            for (int j=0; j<mSize; j++) {
                if(minusPos[i][j]) {
                    map[i][j]--;
                }
            }
        }
    }

    private static void fireStorm(int L) {
        int lSize = (int) Math.pow(2, L);

        for(int i=0; i<mSize; i=i+lSize) {
            for(int j=0; j<mSize; j=j+lSize) {
                int[][] sMap = rotate(makeMap(i, j, lSize) ,lSize);
                setMap(i, j, lSize, sMap);
            }
        }
    }

    private static void setMap(int startX, int startY, int lSize, int[][] sMap) {
        for(int i=startX; i<startX+lSize; i++) {
            for(int j=startY; j<startY+lSize; j++) {
                map[i][j] = sMap[i-startX][j-startY];
            }
        }
    }

    private static int[][] makeMap(int startX, int startY, int lSize) {
        int[][] resultMap = new int[lSize][lSize];

        for(int i=startX; i<startX+lSize; i++) {
            for(int j=startY; j<startY+lSize; j++) {
                resultMap[i-startX][j-startY] = map[i][j];
            }
        }

        return resultMap;
    }

    private static int[][] rotate(int[][] sMap, int lSize) {
        int[][] resultMap = new int[lSize][lSize];

        for(int i=0; i<lSize; i++) {
            for(int j=0; j<lSize; j++) {
                resultMap[j][lSize-i-1] = sMap[i][j];
            }
        }

        return resultMap;
    }

    private static void init(BufferedReader br, StringTokenizer st) throws Exception {
        N = Integer.parseInt(st.nextToken());
        Q = Integer.parseInt(st.nextToken());

        mSize = (int) Math.pow(2, N);
        map = new int[mSize][mSize];

        for(int i=0; i<mSize; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<mSize; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

}
