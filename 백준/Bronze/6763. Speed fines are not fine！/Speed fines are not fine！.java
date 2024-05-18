import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int limit = Integer.parseInt(br.readLine());
        int speed = Integer.parseInt(br.readLine());

        if(speed <= limit) {
            res.append("Congratulations, you are within the speed limit!");
        } else {
            res.append("You are speeding and your fine is ");
            if(speed - limit <= 20) {
                res.append("$100");
            } else if(speed - limit <= 30) {
                res.append("$270");
            } else {
                res.append("$500");
            }
            res.append(".");
        }

        System.out.println(res.toString());
        br.close();
    }

}
