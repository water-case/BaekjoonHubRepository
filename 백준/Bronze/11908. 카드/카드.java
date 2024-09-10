import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        IntSummaryStatistics stats = Arrays.stream(br.readLine().split(" "))
                                            .mapToInt(Integer::parseInt)
                                            .summaryStatistics();

        int res = (int)(stats.getSum() - stats.getMax());

        System.out.println(res);
        br.close();
    }

}
