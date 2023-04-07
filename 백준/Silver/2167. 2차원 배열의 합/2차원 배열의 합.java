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
        arr = new int[N][M];

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<M; j++) {
                arr[i][j]= Integer.parseInt(st.nextToken());
            }
        }

        int K = Integer.parseInt(br.readLine());
        calCase = new ArrayList<>();
        while(K-->0) {
            st = new StringTokenizer(br.readLine(), " ");
            int[] tmp = new int[4];
            tmp[0] = Integer.parseInt(st.nextToken())-1;
            tmp[1] = Integer.parseInt(st.nextToken())-1;
            tmp[2] = Integer.parseInt(st.nextToken())-1;
            tmp[3] = Integer.parseInt(st.nextToken())-1;
            calCase.add(tmp);
        }

        br.close();
    }

    static int N, M;
    static int[][] arr;
    static List<int[]> calCase;

    private static void solve() {
        StringBuilder res = new StringBuilder();

        for(int[] ia : calCase) {
            int i = ia[0];
            int j = ia[1];
            int x = ia[2];
            int y = ia[3];

            int cal = 0;
            for(int a=i; a<=x; a++) {
                for(int b=j; b<=y; b++) {
                    cal += arr[a][b];
                }
            }
            res.append(cal).append("\n");
        }
        System.out.println(res);
    }

}
