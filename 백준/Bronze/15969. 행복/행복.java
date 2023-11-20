import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<Integer> scoreList = Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(scoreList.get(0) - scoreList.get(scoreList.size()-1));
        br.close();
    }

}
