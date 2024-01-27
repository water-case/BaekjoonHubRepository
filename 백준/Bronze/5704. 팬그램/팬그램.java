import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        String input = "";
        while(!(input = br.readLine()).equals("*")) {
            long alphaCnt = Arrays.stream(input.split(""))
                                    .distinct()
                                    .filter(str -> !str.equals(" "))
                                    .count();

            res.append(26 == alphaCnt ? "Y" : "N").append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
