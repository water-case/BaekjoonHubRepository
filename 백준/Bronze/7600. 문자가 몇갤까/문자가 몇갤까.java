import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        String input = "";
        while(!(input = br.readLine()).equals("#")) {
            input = input.replaceAll("[^A-z]", "").toLowerCase();
            int cnt = Arrays.stream(input.split(""))
                            .distinct()
                            .collect(Collectors.joining())
                            .length();

            res.append(cnt)
                .append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
