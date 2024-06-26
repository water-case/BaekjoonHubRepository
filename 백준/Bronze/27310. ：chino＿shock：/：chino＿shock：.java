import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = str.length() +
                str.replaceAll("[^:]", "").length() +
                str.replaceAll("[^_]","").length()*5;

        System.out.println(res);
        br.close();
    }

}
