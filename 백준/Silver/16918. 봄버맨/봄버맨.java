import java.io.*;
import java.util.*;

public class Main {

    static int[] delx = {-1, 0, 1, 0};
    static int[] dely = { 0, 1, 0,-1};
    static int R, C, N;
    static char[][] map;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        map = new char[R][C];
        for(int i=0; i<R; i++) {
            map[i] = br.readLine().toCharArray();
        }

        char[][] resMap = null;
        if(N < 2) {
            resMap = map;
        } else {
            char[][][] mapList = makeMap();
            resMap = mapList[(N-2)%4];
        }

        System.out.print(makeResult(resMap));
        br.close();
    }

    private static char[][][] makeMap() {
        char[][][] res = new char[4][R][C];

        // 초기상태에서 1초가 지난 후 모든 칸 폭탄 설치
        char[][] tmap = new char[R][C];
        for(int i=0; i<R; i++) {
            Arrays.fill(tmap[i], 'O');
        }
        res[0] = tmap;

        // 폭탄 터짐
        tmap = new char[R][C];
        for(int i=0; i<R; i++) {
            Arrays.fill(tmap[i], 'O');
        }
        for(int i=0; i<R ; i++) {
            for(int j=0; j<C; j++){
                if(map[i][j] == 'O') {
                    tmap[i][j] = '.';
                    for(int d=0; d<4; d++){
                        int dx = i+delx[d];
                        int dy = j+dely[d];
                        if(dx<0 || dx>=R || dy<0 || dy>=C) continue;
                        tmap[dx][dy] = '.';
                    }
                }
            }
        }
        res[1] = tmap;

        // 다시 폭탄 설치
        tmap = new char[R][C];
        for(int i=0; i<R; i++) {
            Arrays.fill(tmap[i], 'O');
        }
        res[2] = tmap;

        // 폭탄 터짐
        tmap = new char[R][C];
        for(int i=0; i<R; i++) {
            Arrays.fill(tmap[i], 'O');
        }
        for(int i=0; i<R ; i++) {
            for(int j=0; j<C; j++){
                if(res[1][i][j] == 'O') {
                    tmap[i][j] = '.';
                    for(int d=0; d<4; d++){
                        int dx = i+delx[d];
                        int dy = j+dely[d];
                        if(dx<0 || dx>=R || dy<0 || dy>=C) continue;
                        tmap[dx][dy] = '.';
                    }
                }
            }
        }
        res[3] = tmap;

        // 위의 4가지 형태의 맵이 반복됨
        return res;
    }

    private static String makeResult(char[][] map) {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<R; i++) {
            for(int j=0; j<C; j++){
                sb.append(map[i][j]);
            }
            sb.append("\n");
        }

        return sb.toString();
    }

}
