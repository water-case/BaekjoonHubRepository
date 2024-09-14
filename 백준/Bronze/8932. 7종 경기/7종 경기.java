import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    enum TYPE {TRACK, FIELD};

    static double[] aArr = {9.23076, 1.84523, 56.0211, 4.99087, 0.188807, 15.9803, 0.11193};
    static double[] bArr = {26.7, 75, 1.5, 42.5, 210, 3.8, 254};
    static double[] cArr = {1.835, 1.348, 1.05, 1.81, 1.41, 1.04, 1.88};
    static TYPE[]   tArr = {TYPE.TRACK, TYPE.FIELD, TYPE.FIELD, TYPE.TRACK, TYPE.FIELD, TYPE.FIELD, TYPE.TRACK};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while(T-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int idx = 0;
            int totalScore = 0;
            while(st.hasMoreTokens()) {
                totalScore += getScore(Integer.parseInt(st.nextToken()), idx++);
            }

            res.append(totalScore).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

    private static int getScore(double score, int idx) {

        double cal = (tArr[idx] == TYPE.TRACK)
                                ? bArr[idx]-score : score-bArr[idx];

        return (int) Math.floor(aArr[idx] * Math.pow(cal, cArr[idx]));
    }

}
