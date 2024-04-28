import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] label = "WelcomeToSMUPC".split("");
        int N = Integer.parseInt(br.readLine())-1;

        int pos = N % (label.length);
        System.out.println(label[pos]);
        br.close();
    }

}
