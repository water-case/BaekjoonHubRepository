import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        tcList = new ArrayList<>();
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            if(N==0 && M==0) {
                break;
            }

            int[] nArr = new int[N];
            for(int i=0; i<N; i++) {
                nArr[i] = Integer.parseInt(br.readLine());
            }

            int[] mArr = new int[M];
            for(int i=0; i<M; i++) {
                mArr[i] = Integer.parseInt(br.readLine());
            }
            tcList.add(new TC(nArr, mArr));
        }

        br.close();
    }

    static List<TC> tcList;

    private static void solve() {
        StringBuilder res = new StringBuilder();

        for(TC tc : tcList) {
            int[] nArr = tc.nArr;
            int[] mArr = tc.mArr;
            int cnt = 0;

            for(int n : nArr) {
                int start = 0, end = mArr.length-1;

                while(start <= end) {
                    int mid = (start + end) / 2;
                    int val = mArr[mid];

                    if(val == n) {
                        cnt++;
                        break;
                    }

                    if(val > n) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
            }
            res.append(cnt).append("\n");
        }
        System.out.println(res);
    }

    static class TC {
        int[] nArr, mArr;

        public TC(int[] nArr, int[] mArr) {
            this.nArr = nArr;
            this.mArr = mArr;
        }
    }

}
