import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        if(input.length() % 3 != 0) {
            for(int i=0; i<3; i++) {
                input = "0" + input;

                if(input.length() % 3 == 0) {
                    break;
                }
            }
        }

        StringBuilder res = new StringBuilder();
        for(int i=0; i<input.length()/3; i++) {
            res.append(Integer.toOctalString(Integer.parseInt(input.substring(i*3, i*3+3), 2)));
        }

        System.out.println(res.toString());
        br.close();
    }

}
