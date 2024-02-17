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

        List<Integer> nList = Arrays.stream(br.readLine().split(" "))
                                    .map(Integer::parseInt)
                                    .sorted()
                                    .collect(Collectors.toList());

        System.out.println(Math.abs((nList.get(0) + nList.get(3)) - (nList.get(1) + nList.get(2))));
        br.close();
    }

}
