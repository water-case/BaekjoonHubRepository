import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String H = br.readLine();
        String N = br.readLine();

        String s = H.replaceAll("(?:(?!"+ N +").)", "");
        System.out.println(s.length());
        br.close();
    }

}
