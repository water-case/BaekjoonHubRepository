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
        int N = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());

        bArr = new Bus[N];
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int ts = Integer.parseInt(st.nextToken());
            int ti = Integer.parseInt(st.nextToken());
            int tc = Integer.parseInt(st.nextToken());
            bArr[i] = new Bus(ts, ti, tc);
        }

        br.close();
    }

    static int T;
    static Bus[] bArr;


    private static void solve() {
        int res = Integer.MAX_VALUE;

        for(Bus b : bArr) {
            if(T > b.getMax()) {
                continue;
            }

            int cal = T - b.S;

            if(cal < 0) {
                cal *= -1;
            } else if(cal == 0) {
                res = 0;
                break;
            } else {
                cal %= b.I;

                if(cal != 0) {
                    cal = b.I - cal;
                }
            }

            res = Math.min(res, cal);
        }

        res = res == Integer.MAX_VALUE ? -1 : res;
        System.out.println(res);
    }

    private static class Bus {
        int S, I, C;

        public Bus(int s, int i, int c) {
            S = s;
            I = i;
            C = c;
        }

        public int getMax() {
            return S + I * (C - 1);
        }
    }

}
