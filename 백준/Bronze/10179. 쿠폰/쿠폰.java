import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while(T-->0) {
            double dollar = Double.parseDouble(br.readLine());

            res.append("$")
                .append(String.format("%.2f", dollar * 0.8))
                .append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
