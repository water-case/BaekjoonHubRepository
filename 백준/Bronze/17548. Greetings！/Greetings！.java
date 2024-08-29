import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        String s = br.readLine();
        res.append(s.substring(0, 1));
        res.append(s.substring(1, s.length()-1));
        res.append(s.substring(1, s.length()-1));
        res.append(s.substring(s.length()-1));

        System.out.println(res.toString());
        br.close();
    }

}
