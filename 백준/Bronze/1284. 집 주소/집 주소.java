import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        while(true) {
            String input = br.readLine();
            if(input.equals("0")) {
                break;
            }

            int cnt = 1;
            for(String nStr : input.split("")) {
                switch (nStr) {
                    case "1" : cnt+=3; break;
                    case "0" : cnt+=5; break;
                    default : cnt+=4; break;
                }
            }

            res.append(cnt).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
