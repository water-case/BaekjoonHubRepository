import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        while(t-->0) {
            int n = Integer.parseInt(br.readLine());
            List<Integer> nPos = Arrays.stream(br.readLine().split(" "))
                                        .map(Integer::parseInt)
                                        .sorted()
                                        .collect(Collectors.toList());

            int max = nPos.get(nPos.size()-1);
            int min = nPos.get(0);

            res.append(2 * (max - min))
                .append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
