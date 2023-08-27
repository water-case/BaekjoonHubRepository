import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new LinkedHashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while(st.hasMoreTokens()) {
            map.put(st.nextToken(), 0);
        }

        while(N-->0) {
            st = new StringTokenizer(br.readLine(), " ");
            while(st.hasMoreTokens()) {
                String name = st.nextToken();
                map.put(name, map.getOrDefault(name, 0) + 1);
            }
        }

        StringBuilder sb = new StringBuilder();
        map.entrySet().stream()
                .sorted((o1, o2) -> {
                    if(o1.getValue() != o2.getValue()) {
                        return o2.getValue().compareTo(o1.getValue());
                    }
                    return o1.getKey().compareTo(o2.getKey());
                })
                .forEach(entry -> sb.append(entry.getKey()).append(" ").append(entry.getValue()).append("\n"));

        System.out.println(sb.toString());
        br.close();
    }

}
