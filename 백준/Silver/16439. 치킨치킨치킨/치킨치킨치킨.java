import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken()); // 회원수
        M = Integer.parseInt(st.nextToken()); // 치킨 종류

        score = new int[N][M];
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<M; j++) {
                score[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        scoreCalc(new int[3], 0, 0);

        System.out.println(res);
        br.close();
    }

    static int res, N, M;
    static int[][] score;

    private static void scoreCalc(int[] pick, int cnt, int idx) {
        if(cnt == 3) {
            int calc = 0;
            for(int i=0; i<N; i++) {
                int max = 0;
                for(int num : pick) {
                    max = Math.max(max, score[i][num]);
                }
                calc += max;
            }
            res = Math.max(res, calc);
            return;
        }

        for(int i=idx; i<M; i++) {
            pick[cnt] = i;
            scoreCalc(pick, cnt+1, i);
        }
    }

}
