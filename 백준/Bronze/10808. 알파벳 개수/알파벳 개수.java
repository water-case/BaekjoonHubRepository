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

    static String res, word;

    private static void solve() {
        int[] wordCnt = new int[26];
        char[] wordAlpha = word.toCharArray();

        for(char c : wordAlpha) {
            wordCnt[c-97]++;
        }

        for(int i : wordCnt) {
            res += i + " ";
        }
    }

    private static void init(BufferedReader br) throws Exception {
        res = "";
        word = br.readLine();
    }

}
