import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        for(int i=1; i<=N; i++) {
            res.append(i + ". " + br.readLine())
                .append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
