import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        scoreList = new ArrayList<>();
        for(int i=1; i<=8; i++) {
            scoreList.add(new int[] {i, Integer.parseInt(br.readLine())});
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static List<int[]> scoreList;

    private static void solve() {
        int res = 0;
        StringBuilder res2 = new StringBuilder();

        Collections.sort(scoreList, (o1, o2) -> -Integer.compare(o1[1], o2[1]));

        res = scoreList.stream().limit(5)
                .mapToInt(scoreArr -> scoreArr[1])
                .sum();

        scoreList.stream()
                .map(scoreArr -> scoreArr[0])
                .limit(5)
                .sorted()
                .forEach(score -> res2.append(score).append(" "));

        System.out.println(res);
        System.out.println(res2.toString());
    }

}
