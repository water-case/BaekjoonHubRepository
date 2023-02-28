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

        scoreList = new ArrayList<>();
        for(int i=0; i<5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int[] score = new int[]{i+1, 0};
            for(int j=0; j<4; j++) {
                score[1] += Integer.parseInt(st.nextToken());
            }

            scoreList.add(score);
        }

        br.close();
    }

    static String res;
    static List<int[]> scoreList;

    private static void solve() {
        int[] winner = scoreList.stream().max((o1, o2) -> {
                return Integer.compare(o1[1], o2[1]);
        }).get();

        res = winner[0] + " " + winner[1];
    }

}
