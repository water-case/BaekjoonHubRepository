import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        xArr = new int[M];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<M; i++) {
            xArr[i] = Integer.parseInt(st.nextToken());
        }

        br.close();
    }

    static int N, M;
    static int[] xArr;

    private static void solve() {
        int res = 0;

        int start = 1, end = N;
        while(start <= end) {
            int mid = (start + end) / 2;

            int ve = 0;

            for(int x : xArr) {
                if(x - mid > ve) {
                    break;
                }

                ve = x + mid;
            }

            if(ve >= N) {
                res = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        System.out.println(res);
    }

}
