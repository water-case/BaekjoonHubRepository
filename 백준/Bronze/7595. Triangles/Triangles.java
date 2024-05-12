import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        String str = "";
        while(!(str = br.readLine()).equals("0")) {
            int n = Integer.parseInt(str);

            for(int i=1; i<=n ;i++) {
                for(int j=1; j<=i; j++) {
                    res.append("*");
                }
                res.append("\n");
            }
        }

        System.out.println(res.toString());
        br.close();
    }

}
