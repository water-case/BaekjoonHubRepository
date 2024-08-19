import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        while(n-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            String a = st.nextToken();
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            res.append(a.substring(0, i)).append(a.substring(j,a.length())).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
