import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int v = n/5;
        int i = n%5;

        StringBuilder res = new StringBuilder();
        while(v-->0) {
            res.append("V");
        }
        while(i-->0) {
            res.append("I");
        }

        System.out.println(res.toString());
        br.close();
    }

}
