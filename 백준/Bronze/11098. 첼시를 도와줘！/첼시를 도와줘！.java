import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        while(n-->0) {
            int p = Integer.parseInt(br.readLine());
            HashMap<Integer, String> hMap = new HashMap<>();
            while(p-->0) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                hMap.put(Integer.parseInt(st.nextToken()), st.nextToken());
            }

            res.append(hMap.entrySet().stream()
                            .sorted((o1, o2) -> -Integer.compare(o1.getKey(), o2.getKey()))
                            .findFirst()
                            .get()
                            .getValue())
                .append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
