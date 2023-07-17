import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();
        while(N-->0) {
            String word = br.readLine();
            if(word.length() < M) {
                continue;
            }

            int cnt = 0;
            if(map.containsKey(word)) {
                cnt = map.get(word);
            }
            map.put(word, cnt + 1);
        }

        StringBuilder res = new StringBuilder();
        map.entrySet().stream()
                .sorted((a, b) -> {
                    if(a.getValue() != b.getValue()) {
                        return -Integer.compare(a.getValue(), b.getValue());
                    }
                    if(a.getKey().length() != b.getKey().length()) {
                        return -Integer.compare(a.getKey().length(), b.getKey().length());
                    }
                    return a.getKey().compareTo(b.getKey());
                })
                .map(Map.Entry::getKey)
                .forEach(str -> res.append(str).append("\n"));

        System.out.println(res.toString());
        br.close();
    }

}
