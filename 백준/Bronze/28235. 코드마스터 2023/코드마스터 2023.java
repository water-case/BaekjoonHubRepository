import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "";
        switch (br.readLine()) {
            case "SONGDO" :  str = "HIGHSCHOOL"; break;
            case "CODE" :  str = "MASTER"; break;
            case "2023" :  str = "0611"; break;
            case "ALGORITHM" :  str = "CONTEST"; break;
        }

        System.out.println(str);
        br.close();
    }

}
