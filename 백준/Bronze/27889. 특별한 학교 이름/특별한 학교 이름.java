import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "";
        switch (br.readLine()) {
            case "NLCS" : str = "North London Collegiate School"; break;
            case "BHA" : str = "Branksome Hall Asia"; break;
            case "KIS" : str = "Korea International School"; break;
            case "SJA" : str = "St. Johnsbury Academy"; break;
        }

        System.out.println(str);
        br.close();
    }

}
