import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strArr = (br.readLine() + "=").split("\\(\\^0\\^\\)");

        StringBuilder res = new StringBuilder();
        for(String str : strArr) {
            res.append(str.replaceAll("[^@]", "").length()).append(" ");
        }
        System.out.println(res.toString());
        br.close();
    }

}
