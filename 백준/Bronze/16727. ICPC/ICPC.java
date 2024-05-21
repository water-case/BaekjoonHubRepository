import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] score = new int[2][2];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        score[0][0] += Integer.parseInt(st.nextToken());
        score[0][1] += Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        score[1][1] += Integer.parseInt(st.nextToken());
        score[1][0] += Integer.parseInt(st.nextToken());

        String res = "Penalty";
        int[] sumArr = {score[0][0] + score[1][0], score[0][1] + score[1][1]};
        if(sumArr[0]>sumArr[1]) {
            res = "Persepolis";
        } else if(sumArr[0]<sumArr[1]) {
            res = "Esteghlal";
        } else {
            if(score[0][1]>score[1][0]) {
                res = "Esteghlal";
            } else if(score[0][1]<score[1][0]) {
                res = "Persepolis";
            }
        }

        System.out.println(res);
        br.close();
    }

}
