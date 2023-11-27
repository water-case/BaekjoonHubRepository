import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for(int tc=1; tc<=T; tc++) {
            res.append("Case ")
                    .append(tc)
                    .append(": ")
                    .append(
                            Arrays.stream(br.readLine().split(" "))
                                    .mapToInt(Integer::parseInt)
                                    .sum()
                    )
                    .append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
