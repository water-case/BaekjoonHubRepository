import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine())-1;
        int idx = 1;
        int a = 1;
        int b = 1;

        while(N-->0) {
            if(b == idx) {
                a = idx+1;
                b = 1;
                idx++;
                continue;
            }

            a--;
            b++;
        }

        System.out.println(a + " " + b);
        br.close();
    }

}
