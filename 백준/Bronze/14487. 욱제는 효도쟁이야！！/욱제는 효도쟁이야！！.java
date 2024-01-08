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

        int n = Integer.parseInt(br.readLine());
        List<Integer> nList = Arrays.stream(br.readLine().split(" "))
                                    .map(Integer::parseInt)
                                    .sorted()
                                    .collect(Collectors.toList());

        int sum = nList.stream().limit(n-1).mapToInt(i->i).sum();
        System.out.println(sum);
        br.close();
    }

}
