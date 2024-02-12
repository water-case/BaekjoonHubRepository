import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String telNo = br.readLine();

        System.out.println(telNo.substring(0,3).equals("555") ? "YES" : "NO");
        br.close();
    }

}
