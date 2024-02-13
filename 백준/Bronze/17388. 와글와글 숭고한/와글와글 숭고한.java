import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Soongsil", Integer.parseInt(st.nextToken()));
        map.put("Korea ", Integer.parseInt(st.nextToken()));
        map.put("Hanyang ", Integer.parseInt(st.nextToken()));

        int sum = map.entrySet().stream()
                                .map(set -> set.getValue())
                                .mapToInt(i -> i)
                                .sum();
        Map.Entry<String, Integer> entry =
                map.entrySet().stream()
                                .sorted((o1, o2) -> Integer.compare(o1.getValue(), o2.getValue()))
                                .findFirst()
                                .get();

        String res = "";
        if(sum >= 100) {
            res = "OK";
        } else {
            res = entry.getKey();
        }

        System.out.println(res);
        br.close();
    }

}
