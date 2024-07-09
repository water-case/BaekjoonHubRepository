import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String res = "";
        int maxLevel = Integer.MAX_VALUE;
        int N = Integer.parseInt(br.readLine());
        while(N-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String str = st.nextToken();
            int level = Integer.parseInt(st.nextToken());

            if(level < maxLevel) {
                res = str;
                maxLevel = level;
            }
        }

        System.out.println(res);
        br.close();
    }

}
