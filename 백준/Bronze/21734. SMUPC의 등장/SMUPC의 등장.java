import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        char[] cArr = br.readLine().toCharArray();
        for(int i=0; i<cArr.length; i++) {
            int cnt = Arrays.stream(String.valueOf((int)cArr[i]).split(""))
                            .mapToInt(Integer::parseInt)
                            .sum();

            for(int j=0; j<cnt; j++) {
                res.append(cArr[i]);
            }
            res.append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
