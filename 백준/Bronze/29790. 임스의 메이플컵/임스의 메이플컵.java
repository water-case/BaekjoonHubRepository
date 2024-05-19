import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); // 문제 해결 개수
        int U = Integer.parseInt(st.nextToken()); // 유니온 레벨
        int L = Integer.parseInt(st.nextToken()); // 최고 레벨

        String res = N>=1000 ? (U>=8000 || L>=260) ? "Very Good" : "Good" : "Bad";
        System.out.println(res);
        br.close();
    }

}
