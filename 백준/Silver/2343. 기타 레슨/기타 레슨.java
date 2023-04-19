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

        nList = new ArrayList<>();
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++) {
            int n = Integer.parseInt(st.nextToken());
            max = Math.max(max, n);
            nList.add(n);
            sum += n;
        }

        br.close();
    }

    static int N, M;
    static int max, sum;
    static List<Integer> nList;

    private static void solve() {
        int res = 0;

        int start = max;
        int end = sum;
        while(start <= end) {
            int mid = (start + end) / 2;

            int cnt = 0;
            int sum = 0;
            for(int n : nList) {
                if(sum + n <= mid) {
                    sum += n;
                } else {
                    sum = n;
                    cnt++;
                }
            }
            if(sum != 0) {
                cnt++;
            }
            if(cnt <= M) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        res = start;

        System.out.println(res);
    }

}
