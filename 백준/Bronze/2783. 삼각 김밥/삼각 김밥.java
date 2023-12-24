import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        double X = Integer.parseInt(st.nextToken());
        double Y = Integer.parseInt(st.nextToken());

        double now = X/Y;

        int N = Integer.parseInt(br.readLine());
        while(N-->0) {
            st = new StringTokenizer(br.readLine(), " ");
            double Xi = Integer.parseInt(st.nextToken());
            double Yi = Integer.parseInt(st.nextToken());

            double cal = Xi/Yi;

            if(now > cal) {
                now = cal;
            }
        }

        System.out.println(String.format("%.2f", now*1000));
        br.close();
    }

}
