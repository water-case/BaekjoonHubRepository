import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); // 메시지의 숫자
        int C = Integer.parseInt(st.nextToken()); // 숫자의 크기

        // 숫자의 범위가 10억이므로 O(1) 시간복잡도의 해쉬맵사용
        Map<Integer, Integer> map = new LinkedHashMap<>();
        st = new StringTokenizer(br.readLine(), " ");
        while(N-->0) {

            int now = Integer.parseInt(st.nextToken());

            int cnt = 0;
            if(map.containsKey(now)) {
                cnt = map.get(now);
            }

            map.put(now, cnt + 1);
        }

        StringBuilder res = new StringBuilder();
        map.entrySet().stream()
                .sorted(Comparator.comparing(set -> -set.getValue()))
                .forEach(entry -> {
                    for(int i=0; i<entry.getValue(); i++) {
                        res.append(entry.getKey()).append(" ");
                    }
                });

        System.out.println(res.toString());
        br.close();
    }

}
