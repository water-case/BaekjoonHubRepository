import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while(st.hasMoreTokens()) {
            String word = st.nextToken();
            word = word.replaceAll("ap.", "a");
            word = word.replaceAll("ep.", "e");
            word = word.replaceAll("ip.", "i");
            word = word.replaceAll("op.", "o");
            word = word.replaceAll("up.", "u");
            res.append(word).append(" ");
        }

        System.out.println(res.toString());
        br.close();
    }

}
