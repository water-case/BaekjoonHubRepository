import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        nArr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++) {
            nArr[i] = Integer.parseInt(st.nextToken());
        }

        br.close();
    }

    static int[] nArr;


    private static void solve() {
        long res = 0;

        long sum = 0;
        for(int n : nArr) {
            res += sum * n;
            sum += n;
        }

        System.out.println(res);
    }

}
