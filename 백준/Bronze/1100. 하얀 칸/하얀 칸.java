import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        map = new char[8][];
        for(int i=0; i<8; i++) {
            map[i] = br.readLine().toCharArray();
        }

        br.close();
    }

    static char[][] map;

    private static void solve() {
        int res = 0;
        boolean white = false;

        for(int i=0; i<8; i++) {
            white = !white;

            for(int j=0; j<8; j++) {
                if(white && map[i][j]=='F') {
                    res++;
                }
                white = !white;
            }
        }

        System.out.println(res);
    }

}
