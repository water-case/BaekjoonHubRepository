import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        String input = "";
        while(!(input = br.readLine()).equals("0")) {
            int n = Integer.parseInt(input);

            while(n>=10) {
                res.append(n).append(" ");

                int cal = 1;
                int tmp = n;
                while(tmp>0) {
                    cal *= tmp%10;
                    tmp /= 10;
                }
                n = cal;
            }

            res.append(n).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
