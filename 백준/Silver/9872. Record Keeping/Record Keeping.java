import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Map<Set<String>, Integer> map = new HashMap<>();
        while(N-->0) {

            Set<String> nameSet = new HashSet<>();
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            while(st.hasMoreTokens()) {
                nameSet.add(st.nextToken());
            }

            map.put(nameSet, map.getOrDefault(nameSet, 0) + 1);
        }

        int res = 0;
        for(int i : map.values()) {
            res = Math.max(res, i);
        }

        System.out.println(res);
        br.close();
    }

}
