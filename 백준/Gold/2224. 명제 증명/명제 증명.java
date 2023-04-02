import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        g = new boolean[58][58];

        int N = Integer.parseInt(br.readLine());
        while(N-->0) {
            char[] ca = br.readLine().toCharArray();
            int a = ca[0]-65;
            int b = ca[5]-65;
            g[a][b] = true;
        }

        br.close();
    }

    static boolean[][] g;

    private static void solve() {
        StringBuilder sb = new StringBuilder();

        floydWarshall();
        List<int[]> resList = searchResult();

        sb.append(resList.size()).append("\n");
        for(int[] ia : resList) {
            sb.append((char)ia[0]).append(" => ").append((char)ia[1]).append("\n");
        }

        System.out.println(sb.toString());
    }

    private static void floydWarshall() {
        for(int k=0; k<58; k++) {
            for(int i=0; i<58; i++) {
                for(int j=0; j<58; j++) {
                    if(g[i][j] || i==j) {
                        continue;
                    }

                    if(g[i][k] && g[k][j]) {
                        g[i][j] = true;
                    }
                }
            }
        }
    }

    private static List<int[]> searchResult() {
        List<int[]> resList = new ArrayList<>();

        for(int i=0; i<58; i++) {
            for(int j=0; j<58; j++) {
                if(i==j) {
                    continue;
                }
                if(g[i][j]) {
                    int[] res = {i+65,j+65};
                    resList.add(res);
                }
            }
        }

        return resList;
    }

}
