import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] promiseArr = {
                "Never gonna give you up",
                "Never gonna let you down",
                "Never gonna run around and desert you",
                "Never gonna make you cry",
                "Never gonna say goodbye",
                "Never gonna tell a lie and hurt you",
                "Never gonna stop"
        };

        String res = "No";

        int N = Integer.parseInt(br.readLine());
        while(N-->0) {
            String Si = br.readLine();

            long cnt = Arrays.stream(promiseArr)
                        .filter(s -> s.equals(Si))
                        .count();

            if(cnt == 0) {
                res = "Yes";
                break;
            }
        }

        System.out.println(res);
        br.close();
    }

}
