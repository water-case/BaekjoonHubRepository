import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int a = 100 - A;
        int b = 100 - B;
        int c = 100 - (a + b);
        int d = a * b;
        int q = d / 100;
        int r = d % 100;

        StringBuilder res = new StringBuilder();
        res.append(a).append(" ").append(b).append(" ").append(c).append(" ").append(d).append(" ").append(q).append(" ").append(r).append("\n")
            .append(c+q).append(" ").append(r);

        System.out.println(res.toString());
        br.close();
    }

}
