import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while(T-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int pos = Integer.parseInt(st.nextToken());

            String word = st.nextToken();

            res.append(word.substring(0, pos-1)).append(word.substring(pos)).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
