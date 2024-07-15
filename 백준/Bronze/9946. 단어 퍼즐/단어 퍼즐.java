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

        String str = "";
        int idx = 1;
        while(!(str = br.readLine()).equals("END")) {
            String getStr = br.readLine();

            res.append("Case ")
                .append(idx++)
                .append(": ")
                .append(getSortString(str).equals(getSortString(getStr)) ? "same" : "different")
                .append("\n");

        }

        System.out.println(res.toString());
        br.close();
    }

    private static String getSortString(String str) {
        return Arrays.stream(str.split(""))
                .sorted()
                .collect(Collectors.joining());
    }

}
