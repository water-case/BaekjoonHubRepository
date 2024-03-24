import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] cakes = new int[2][];
        for(int i=0; i<2; i++) {
            cakes[i] = Arrays.stream(br.readLine().split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray();
        }

        // bx = cakes[1][0] - cakes[0][2]
        // by = cakes[1][1] / cakes[0][1]
        // bz = cakes[1][2] - cakes[0][0]

        StringBuilder res = new StringBuilder();
        res.append(cakes[1][0] - cakes[0][2]).append(" ")
            .append(cakes[1][1] / cakes[0][1]).append(" ")
            .append(cakes[1][2] - cakes[0][0]).append(" ");

        System.out.println(res.toString());
        br.close();
    }

}
