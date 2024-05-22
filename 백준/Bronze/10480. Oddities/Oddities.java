import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        while(n-->0) {
            int x = Integer.parseInt(br.readLine());

            res.append(x).append(" is ")
               .append(x%2==0 ? "even" : "odd")
               .append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
