import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        while(N-->0) {
            int length = br.readLine().length();
            res.append(length>=6 && length<=9 ? "yes" : "no")
               .append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
