import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String res = "뭐야?";
        int N = Integer.parseInt(br.readLine());
        while(N-->0) {
            if(br.readLine().equals("anj")) {
                res = "뭐야;";
                break;
            }
        }

        System.out.println(res);
        br.close();
    }

}
