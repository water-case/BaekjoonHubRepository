import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        String input = "";
        while(!(input = br.readLine()).equals("0 0 0")) {
            StringTokenizer st = new StringTokenizer(input, " ");

            int l = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());

            if(l == 0) {
                l = a/w;
            } else if(w == 0) {
                w = a/l;
            } else {
                a = l*w;
            }

            res.append(l).append(" ").append(w).append(" ").append(a).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
