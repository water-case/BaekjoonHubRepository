import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int res = Integer.parseInt(br.readLine());

        while(true) {
            String calStr = br.readLine();

            if("=".equals(calStr)) {
                break;
            }

            int b = Integer.parseInt(br.readLine());

            switch (calStr) {
                case "+" : res+=b; break;
                case "-" : res-=b; break;
                case "*" : res*=b; break;
                case "/" : res/=b; break;
            }
        }

        System.out.println(res);
        br.close();
    }

}
