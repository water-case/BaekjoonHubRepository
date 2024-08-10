import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = Arrays.stream(br.readLine().split(""))
                            .mapToInt(s -> s.charAt(0) - 65)
                            .toArray();

        int pos = 0, res = 0;
        for(int i : arr) {
            res += Math.min(Math.abs((i-pos+26)%26), Math.abs((pos-i+26)%26));
            pos = i;
        }

        System.out.println(res);

        br.close();
    }

}
