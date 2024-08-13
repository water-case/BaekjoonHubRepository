import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cal = (int)'I' - br.readLine().charAt(0);
        System.out.println(84 + (cal>=0 ? cal : -1 * cal));

        br.close();
    }

}
