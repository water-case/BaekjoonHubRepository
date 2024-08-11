import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int res = 0;

        int N = Integer.parseInt(br.readLine());
        while(N-->0) {
            String str = br.readLine();
            int number = Integer.parseInt(str.substring(0, str.length()-1));
            int pot = Integer.parseInt(str.substring(str.length()-1));

            res += Math.pow(number, pot);
        }

        System.out.println(res);
        br.close();
    }

}
