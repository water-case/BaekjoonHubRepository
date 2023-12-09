import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[] delx = {-1, 0, 1, 0}; // 상우하좌
    static int[] dely = { 0, 1, 0,-1}; // 상우하좌

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        ArrayDeque<int[]> q = new ArrayDeque<>();

        int[][] map = new int[N][N];
        for(int i=0; i<N; i++) {
            map[i] = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        st = new StringTokenizer(br.readLine(), " ");
        int S = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken())-1;
        int Y = Integer.parseInt(st.nextToken())-1;

        for(int k=1; k<=K; k++) {
            for(int i=0; i<N; i++) {
                for(int j=0; j<N; j++) {
                    if(map[i][j] == k) {
                        q.offer(new int[] {0, i, j});
                    }
                }
            }
        }

        while(!q.isEmpty()) {
            int[] now = q.poll();

            if(now[0] == S) {
                break;
            }

            for(int d=0; d<4; d++) {
                int dx = now[1] + delx[d], dy = now[2] + dely[d];

                if(dx<0 || dx>=N || dy<0 || dy>=N || map[dx][dy] != 0) {
                    continue;
                }

                map[dx][dy] = map[now[1]][now[2]];
                q.offer(new int[] {now[0]+1, dx, dy});
            }
        }

        System.out.println(map[X][Y]);
        br.close();
    }

}
