import java.io.*;
import java.util.*;

public class Main {

    static int D, P, Q;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        D = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());
        Q = Integer.parseInt(st.nextToken());

        init();
        int res = solve();

        System.out.println(res);
        br.close();
    }

    private static int solve() {
        int res = Integer.MAX_VALUE;

        if(D % P == 0 || D % Q == 0) {
            return D;
        }

        // P 지폐 최소 사용 횟수 계산
        int pcnt = (D / P) + 1;
        res = Math.min(res, P * pcnt);

        // Q 지폐 사용하면서 지불 최소값 구하기
        for(int i=pcnt-1; i>=0; i--) {
            int div = (D - (P*i)) / Q;
            int mod = (D - (P*i)) % Q;

            if(mod == 0) {
                return D;
            }

            int cal = (P*i) + ((div + 1) * Q);
            if(cal == res) {
                break;
            }

            res = Math.min(res, cal);
        }

        return res;
    }

    private static void init() {

        // P 가 더 크도록 세팅
        if(P < Q) {
            P = P + Q;
            Q = P - Q;
            P = P - Q;
        }

    }

}
