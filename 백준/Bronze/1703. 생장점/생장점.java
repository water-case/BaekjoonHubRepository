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
        while(!(input = br.readLine()).equals("0")) {
            StringTokenizer st = new StringTokenizer(input, " ");

            int a = Integer.parseInt(st.nextToken());

            int cnt = 1;
            while(a-->0) {
                cnt *= Integer.parseInt(st.nextToken());
                cnt -= Integer.parseInt(st.nextToken());
            }

            res.append(cnt).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
