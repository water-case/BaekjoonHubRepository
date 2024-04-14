import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String res = "";

        if(N>=620) {
            res = "Red";
        } else if(N>=590) {
            res = "Orange";
        } else if(N>=570) {
            res = "Yellow";
        } else if(N>=495) {
            res = "Green";
        } else if(N>=450) {
            res = "Blue";
        } else if(N>=425) {
            res = "Indigo";
        } else {
            res = "Violet";
        }

        System.out.println(res);
        br.close();
    }

}
