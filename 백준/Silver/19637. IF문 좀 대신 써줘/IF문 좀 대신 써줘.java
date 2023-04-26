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

        nameArr = new String[N];
        valueArr = new int[N];
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            nameArr[i] = st.nextToken();
            valueArr[i] = Integer.parseInt(st.nextToken());
        }

        inputArr = new int[M];
        for(int i=0; i<M; i++) {
            inputArr[i] = Integer.parseInt(br.readLine());
        }

        br.close();
    }

    static int N,M;
    static String[] nameArr;
    static int[] valueArr, inputArr;

    private static void solve() {
        StringBuilder res = new StringBuilder();

        for(int m : inputArr) {
            int idx = 0;
            int start = 0, end = N-1;

            while(start <= end) {
                int mid = (start + end) / 2;

                if(valueArr[mid] >= m) {
                    idx = mid;
                    end = mid-1;
                } else {
                    start = mid + 1;
                }
            }
            res.append(nameArr[idx]).append("\n");
        }

        System.out.println(res);
    }

}
