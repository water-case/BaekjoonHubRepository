import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int length = Integer.parseInt(br.readLine());
        char[] nameArr = br.readLine().toCharArray();

        int res = 0;
        for(char str : nameArr) {
            res += str-64;
        }

        System.out.println(res);
        br.close();
    }

}
