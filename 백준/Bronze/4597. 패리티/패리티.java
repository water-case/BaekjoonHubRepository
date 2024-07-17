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
        while(!(input = br.readLine()).equals("#")) {
            char c = input.charAt(input.length()-1);

            long cnt = Arrays.stream(input.split(""))
                            .filter(s -> s.equals("1"))
                            .count();

            input = input.replaceAll("[eo]", (c=='e' && cnt%2 != 0) || (c=='o' && cnt%2 == 0) ? "1" : "0");

            res.append(input)
                .append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
