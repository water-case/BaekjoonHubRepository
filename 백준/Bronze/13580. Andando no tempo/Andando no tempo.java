import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] ABC = Arrays.stream(br.readLine().split(" "))
                          .mapToInt(Integer::parseInt)
                          .sorted()
                          .toArray();

        System.out.println(ABC[0]==ABC[1] || ABC[1]==ABC[2] || ABC[0]+ABC[1] == ABC[2] ? "S" : "N");
        br.close();
    }

}
