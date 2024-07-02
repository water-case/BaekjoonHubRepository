import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while(T-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            char[] ca = br.readLine().toCharArray();

            for(int i=0; i<ca.length; i++) {
                ca[i] = (char) ((a*(ca[i]-65) + b) % 26 + 65);
                res.append(ca[i]);
            }
            res.append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
