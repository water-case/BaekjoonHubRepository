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

            res.append("god");
            st.nextToken();
            while(st.hasMoreTokens()) {
                res.append(st.nextToken());
            }
            res.append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
