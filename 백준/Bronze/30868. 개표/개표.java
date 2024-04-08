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
            int n = Integer.parseInt(br.readLine());
            while(n>=5) {
                res.append("++++ ");
                n-=5;
            }
            for(int i=0; i<n; i++) {
                res.append("|");
            }
            res.append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
