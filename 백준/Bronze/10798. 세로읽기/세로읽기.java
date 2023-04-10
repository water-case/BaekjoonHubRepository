import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        wordArr = new String[5][];
        for(int i=0; i<5; i++) {
            wordArr[i] = br.readLine().split("");
        }

        br.close();
    }

    static String[][] wordArr;

    private static void solve() {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<15; i++) {
            for(int j=0; j<5; j++) {
                if(wordArr[j].length <= i) {
                    continue;
                }
                sb.append(wordArr[j][i]);
            }
        }

        System.out.println(sb.toString());
    }

}
