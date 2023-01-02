import java.io.*;
import java.util.*;

public class Main {

    static int N, M, x, y;
    static int[] circle;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while(T-->0) {
            init(br);
            int res = solve();
            sb.append(res).append("\n");
        }

        System.out.println(sb.toString());
        br.close();
    }

    private static int solve() {
        int res = 0;

        for(int i=0; i<N; i++) {
            int cal = 0;
            for(int j=0; j<M; j++) {
                cal = cal*10 + circle[(i+j) % N];
            }

            if(cal>=x && cal<=y) {
                res++;
            }
        }

        return res;
    }

    private static void init(BufferedReader br) throws Exception {
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        x = y = 0;
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<M; i++) {
            x = x*10 + Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<M; i++) {
            y = y*10 + Integer.parseInt(st.nextToken());
        }

        circle = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++) {
            circle[i] = Integer.parseInt(st.nextToken());
        }
    }

}
