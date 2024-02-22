import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());

        String res = "";
        if(M==2 && D==18) {
            res = "Special";
        } else if(M>2 || (M==2&&D>18)) {
            res = "After";
        } else {
            res = "Before";
        }

        System.out.println(res);
        br.close();
    }

}
