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
        int T = Integer.parseInt(br.readLine());
        while(T-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int X = Integer.parseInt(st.nextToken());
            String O = st.nextToken();
            int Y = Integer.parseInt(st.nextToken());
            st.nextToken();
            int Z = Integer.parseInt(st.nextToken());

            int cal = O.equals("+") ? X+Y : X-Y;
            res.append("Case ").append(idx++).append(": ").append(cal==Z ? "YES" : "NO").append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
