import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int joiCnt=0, ioiCnt=0;

        while(str.length() > 2) {
            if(str.startsWith("JOI")) {
                joiCnt++;
            }

            if(str.startsWith("IOI")) {
                ioiCnt++;
            }

            str = str.substring(1);
        }

        System.out.println(joiCnt);
        System.out.println(ioiCnt);
        br.close();
    }

}
