import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();
        while(N-->0) {

            StringTokenizer st = new StringTokenizer(br.readLine(), ".");
            st.nextToken();
            String fileExtension = st.nextToken();

            int cnt = 0;
            if(map.containsKey(fileExtension)) {
                cnt = map.get(fileExtension);
            }
            map.put(fileExtension, cnt + 1);
        }

        StringBuilder res = new StringBuilder();
        map.entrySet().stream()
                .sorted(Comparator.comparing(entry -> entry.getKey()))
                .forEach(entry -> res.append(entry.getKey())
                                        .append(" ")
                                        .append(entry.getValue())
                                        .append("\n")
                );

        System.out.println(res.toString());
        br.close();
    }

}
