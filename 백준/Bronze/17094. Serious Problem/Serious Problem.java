import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int s = Integer.parseInt(br.readLine());
        Map<Character, Long> cntMap = br.readLine().chars()
                                        .mapToObj(c -> (char)c)
                                        .filter(c -> c == '2' || c == 'e')
                                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        int twoCnt = cntMap.containsKey('2') ? cntMap.get('2').intValue() : 0;
        int sCnt = cntMap.containsKey('e') ? cntMap.get('e').intValue() : 0;

        System.out.println(twoCnt==sCnt ? "yee" : twoCnt>sCnt ? "2" : "e");
        br.close();
    }

}
