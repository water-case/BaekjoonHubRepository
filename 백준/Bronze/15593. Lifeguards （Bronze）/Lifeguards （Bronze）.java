import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        nArr = new int[N][2];
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            nArr[i][0] = Integer.parseInt(st.nextToken());
            nArr[i][1] = Integer.parseInt(st.nextToken());
        }

        brute(0, 0, 0, new int[1001]);

        System.out.println(res);
        br.close();
    }

    static final int FIRE_CNT = 1;
    static int N, res;
    static int[][] nArr;

    private static void brute(int cnt, int sum, int fireCnt, int[] map) {
        if(cnt == N) {
            if(fireCnt != FIRE_CNT) {
                return;
            }
            res = Math.max(res, sum);
            return;
        }

        int t = 0;
        for(int i=nArr[cnt][0]; i<nArr[cnt][1]; i++) {
            if(map[i] == 0) {
                t++;
            }
            map[i]++;
        }
        brute(cnt+1, sum+t, fireCnt, map);
        for(int i=nArr[cnt][0]; i<nArr[cnt][1]; i++) {
            map[i]--;
        }

        if(fireCnt < FIRE_CNT) {
            brute(cnt+1, sum, fireCnt+1, map);
        }

    }

}
