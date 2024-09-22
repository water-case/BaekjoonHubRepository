import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        char[] sArr = br.readLine().toCharArray();
        int T = Integer.parseInt(br.readLine());
        while(T-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            char tmp = sArr[A];
            sArr[A] = sArr[B];
            sArr[B] = tmp;
        }

        for(char c : sArr) {
            res.append(c);
        }
        System.out.println(res.toString());
        br.close();
    }

}
