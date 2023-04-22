import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        mList = new ArrayList<>();
        for(int i=0; i<N; i++) {
            int m = Integer.parseInt(br.readLine());
            mList.add(m);
        }

        br.close();
    }

    static int N,M;
    static List<Integer> mList;

    private static void solve() {
        int res = 0;

        int start = 1, end = mList.stream().mapToInt(i->i).sum();
        while(start <= end) {
            int mid = (start + end) / 2;
            int cnt = 1;
            int now = mid;
            boolean fail = false;

            for(int m : mList) {
                if(m > mid) {
                    fail = true;
                    break;
                }

                if(m > now) {
                    if(cnt++ >= M) {
                        break;
                    }
                    now = mid;
                }
                now -= m;
            }

            if(cnt > M || fail) {
                start = mid + 1;
            } else {
                res = mid;
                end = mid - 1;
            }
        }

        System.out.println(res);
    }

}
