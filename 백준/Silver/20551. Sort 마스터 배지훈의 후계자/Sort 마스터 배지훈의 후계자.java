import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        nArr = new int[N];
        for(int i=0; i<N; i++) {
            nArr[i] = Integer.parseInt(br.readLine());
        }
        nArr = Arrays.stream(nArr).sorted().toArray();

        mArr = new int[M];
        for(int i=0; i<M; i++) {
            mArr[i] = Integer.parseInt(br.readLine());
        }

        br.close();
    }

    static int N, M, nArr[], mArr[];

    private static void solve() {
        StringBuilder res = new StringBuilder();

        for(int m : mArr) {
            int idx = -1;
            int start = 0, end = N-1;

            while(start <= end) {
                int mid = (start + end) / 2;

                if(nArr[mid] >= m) {
                    if(nArr[mid] == m) {
                        idx = mid;
                    }

                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            res.append(idx).append("\n");
        }

        System.out.println(res);
    }

}
