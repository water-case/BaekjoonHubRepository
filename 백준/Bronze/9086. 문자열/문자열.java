import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        wordList = new ArrayList<>();
        while(N-->0) {
            wordList.add(br.readLine());
        }
    }

    static String res;
    static List<String> wordList;

    private static void solve() {
        StringBuilder sb = new StringBuilder();

        for(String s : wordList) {
            String str = "";

            String[] sa = s.split("");
            str += sa[0];
            str += sa[sa.length-1];

            sb.append(str).append("\n");
        }

        res = sb.toString();
        System.out.println(res);
    }

}
