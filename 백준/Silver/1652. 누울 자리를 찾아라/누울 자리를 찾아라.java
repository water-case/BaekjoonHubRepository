import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        map = new char[N][];
        for(int i=0; i<N; i++) {
            map[i] = br.readLine().toCharArray();
        }

        br.close();
    }

    static int N;
    static char[][] map;

    private static void solve() {
        StringBuilder res = new StringBuilder();

        int row = loop(DIRECT.ROW);
        int col = loop(DIRECT.COL);

        res.append(row).append(" ").append(col);
        System.out.println(res);
    }

    private static int loop(DIRECT direct) {
        int res = 0;

        for(int i=0; i<N; i++) {
            int cnt = 0;

            for(int j=0; j<N; j++) {
                char c = selectChar(direct, i, j);

                if(c=='.')
                    cnt++;
                else {
                    if(cnt>=2) res++;

                    cnt = 0;
                }
            }

            if(cnt>=2) res++;
        }

        return res;
    }

    private static char selectChar(DIRECT direct, int i, int j) {
        char res = ' ';

        switch(direct) {
            case ROW: res = map[i][j]; break;
            case COL: res = map[j][i]; break;
        }
        
        return res;
    }

    private enum DIRECT {
        ROW, COL
    }

}
