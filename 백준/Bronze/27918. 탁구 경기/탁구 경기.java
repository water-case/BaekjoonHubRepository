import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int d = 0, p = 0;

        int N = Integer.parseInt(br.readLine());
        while(N-->0) {
            if(Math.abs(d-p) >= 2) {
                break;
            }

            if(br.readLine().equals("D")) {
                d++;
            } else {
                p++;
            }
        }

        System.out.println(d + ":" + p);
        br.close();
    }

}
