import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while(T-->0) {
            List<Integer> evenList = Arrays.stream(br.readLine().split(" "))
                    .map(Integer::parseInt)
                    .filter(i -> i%2==0)
                    .sorted()
                    .collect(Collectors.toList());

            res.append(evenList.stream()
                    .mapToInt(i->i)
                    .sum())
                .append(" ")
                .append(evenList.get(0))
                .append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
