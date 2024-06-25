import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        String input = "";
        while((input=br.readLine()) != null) {
            res.append(input)
               .append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
