import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int idx = 1;

        int N = Integer.parseInt(br.readLine());
        while(N-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int max = 0;
            while(st.hasMoreTokens()) {
                max = Math.max(max, Integer.parseInt(st.nextToken()));
            }

            res.append("Case #").append(idx++).append(": ").append(max).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
