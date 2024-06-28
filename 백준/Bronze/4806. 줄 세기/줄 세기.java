import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int res = 0;

        String input = "";
        while((input = br.readLine()) != null) {
            res++;
        }

        System.out.println(res);
        br.close();
    }

}
