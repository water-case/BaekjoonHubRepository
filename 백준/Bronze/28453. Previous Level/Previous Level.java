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
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while(N-->0) {
            int level = Integer.parseInt(st.nextToken());

            res.append(level==300 ? "1" : level>=275 ? "2" : level>=250 ? "3" : "4").append(" ");
        }

        System.out.println(res.toString());
        br.close();
    }

}
