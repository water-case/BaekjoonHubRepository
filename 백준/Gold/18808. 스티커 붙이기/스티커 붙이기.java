import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); // 맵 세로
        int M = Integer.parseInt(st.nextToken()); // 맵 가로
        int K = Integer.parseInt(st.nextToken()); // 스티커의 개수

        boolean[][] map = new boolean[N][M];

        List<Sticker> stickerList = new ArrayList<>();
        while(K-->0) {
            st = new StringTokenizer(br.readLine(), " ");
            int R = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            boolean[][] stickerMap = new boolean[R][C];
            for(int i=0; i<R; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                for(int j=0; j<C; j++) {
                    stickerMap[i][j] = st.nextToken().equals("1");
                }
            }
            stickerList.add(new Sticker(stickerMap));
        }

        int res = 0;
        putStickerOn: for(Sticker sticker : stickerList) {
            for(int d=0; d<4; d++) {
                boolean[][] stickerMap = sticker.map;

                if(stickerMap.length > N || stickerMap[0].length > M) {
                    sticker.rotate();
                    continue;
                }

                for(int n=0; n<=N-stickerMap.length; n++) {
                    nextStartLabel: for(int m=0; m<=M-stickerMap[0].length; m++) {

                        for(int i=0; i<stickerMap.length; i++) {
                            for(int j=0; j<stickerMap[i].length; j++) {
                                if(stickerMap[i][j] && map[n+i][m+j]) {
                                    continue nextStartLabel;
                                }
                            }
                        }

                        for(int i=0; i<stickerMap.length; i++) {
                            for(int j=0; j<stickerMap[i].length; j++) {
                                if(stickerMap[i][j]) {
                                    map[n+i][m+j] = true;
                                    res++;
                                }
                            }
                        }
                        continue putStickerOn;
                    }
                }
                sticker.rotate();
            }
        }

        System.out.println(res);
        br.close();
    }

    private static class Sticker {
        boolean[][] map;

        public Sticker(boolean[][] map) {
            this.map = map;
        }

        public void rotate() {
            int N = map.length;
            int M = map[0].length;
            boolean[][] rotateMap = new boolean[M][N];
            for(int i=0; i<N; i++) {
                for(int j=0; j<M; j++) {
                    rotateMap[j][N-1-i] = map[i][j];
                }
            }
            map = rotateMap;
        }
    }

}
