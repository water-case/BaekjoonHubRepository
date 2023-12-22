import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = 0, b = 0;

        int N = Integer.parseInt(br.readLine());
        while(N-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int ai = Integer.parseInt(st.nextToken());
            int bi = Integer.parseInt(st.nextToken());

            if(ai > bi) {
                a++;
            } else if(ai < bi) {
                b++;
            }
        }

        System.out.println(a + " " + b);
        br.close();
    }

}
