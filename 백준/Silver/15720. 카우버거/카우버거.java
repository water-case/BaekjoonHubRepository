import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] BCD = new int[3];
        for(int i=0; i<3; i++) {
            BCD[i] = Integer.parseInt(st.nextToken());;
        }

        List<Integer>[] originLists = new List[3];
        for(int i=0; i<3; i++) {
            originLists[i] = Stream.of(br.readLine().split(" "))
                    .map(str -> Integer.parseInt(str))
                    .sorted(Collections.reverseOrder())
                    .collect(Collectors.toList());
        }

        int totalOriginSum = 0;
        for(int i=0; i<3; i++) {
            totalOriginSum += originLists[i].stream().mapToInt(n -> n).sum();
        }

        int maxSetCnt = Arrays.stream(BCD).min().getAsInt();
        int totalSetSum = 0;
        for(int i=0; i<3; i++) {
            totalSetSum += IntStream.concat(
                    originLists[i].stream().limit(maxSetCnt).mapToInt(num -> (int) (num * 0.9)),
                    originLists[i].stream().skip(maxSetCnt).mapToInt(n -> n)
            ).sum();
        }

        System.out.println(totalOriginSum + "\n" + totalSetSum);
        br.close();
    }

}
