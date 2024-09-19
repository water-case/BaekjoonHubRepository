import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        String regex = "[A-Z]";
        String replacement = "A";
        if(S.contains("A")) {
            regex = "[BCDF]";
        } else if(S.contains("B")) {
            regex = "[CDF]";
            replacement = "B";
        } else if(S.contains("C")) {
            regex = "[DF]";
            replacement = "C";
        }

        String res = S.replaceAll(regex, replacement);

        System.out.println(res);
        br.close();
    }

}
