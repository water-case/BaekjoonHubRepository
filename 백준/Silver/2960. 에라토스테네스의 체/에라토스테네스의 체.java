import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        init(br);
        solve();

        System.out.println(res);
        br.close();
    }

    static int res;
    static int N, K;
    static boolean[] list;

    private static void solve() {
        int prime = 2;
        int cnt = 1;
        int idx = prime;

        while(true) {
            if(!list[idx]) {
                if(cnt == K) {
                    res = idx;
                    break;
                }

                cnt++;
                list[idx] = true;
            }
            idx += prime;

            if(idx > N) {
                for(int i=0; i<=N; i++) {
                    if(!list[i]) {
                        prime = i;
                        idx = prime;
                        break;
                    }
                }
            }
        }
    }

    private static void init(BufferedReader br) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        list = new boolean[N+1];
        Arrays.fill(list, false);
        Arrays.fill(list, 0, 2, true);
    }

}
