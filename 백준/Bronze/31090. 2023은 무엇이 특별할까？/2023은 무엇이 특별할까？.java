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
            int N = Integer.parseInt(br.readLine());
            if((N+1)%(N%100) == 0) {
                res.append("Good");
            } else {
                res.append("Bye");
            }
            res.append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
