import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        String input = "";
        while(!(input = br.readLine()).equals("-1")) {
            int n = Integer.parseInt(input);

            int cal = 0;
            int saveTime = 0;
            while(n-->0) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");

                int s = Integer.parseInt(st.nextToken());
                int t = Integer.parseInt(st.nextToken());

                int moveTime = t - saveTime;
                saveTime = t;

                cal += s * moveTime;
            }

            res.append(cal).append(" miles").append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
