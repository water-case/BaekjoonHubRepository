import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();

        System.out.println(res);
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        score = new ArrayList<>();
        for(int i=0; i<5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int cal = 0;
            for(int j=0; j<4; j++) {
                cal += Integer.parseInt(st.nextToken());
            }
            score.add(cal);
        }

    }

    static String res;
    static List<Integer> score;

    private static void solve() {
        int idx = 0, max = Integer.MIN_VALUE;

        for(int i=0; i<5; i++) {
            int nowScore = score.get(i);
            if(nowScore > max) {
                idx = i+1;
                max = nowScore;
            }
        }

        res = idx + " " + max;
    }

}
