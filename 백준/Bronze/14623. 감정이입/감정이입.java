import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String b1 = br.readLine();
        String b2 = br.readLine();

        System.out.println(Long.toBinaryString(Long.valueOf(b1, 2) * Long.valueOf(b2, 2)));
        br.close();
    }

}
