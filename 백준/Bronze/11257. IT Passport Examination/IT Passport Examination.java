import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        while(N-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            res.append(st.nextToken()).append(" ");

            int score1 = Integer.parseInt(st.nextToken());
            int score2 = Integer.parseInt(st.nextToken());
            int score3 = Integer.parseInt(st.nextToken());
            int totalScore = score1 + score2 + score3;
            res.append(totalScore).append(" ");

            res.append(totalScore>=55 &&
                       score1>=(double)35*3/10 &&
                       score2>=(double)25*3/10 &&
                       score3>=(double)40*3/10 ? "PASS" : "FAIL").append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
