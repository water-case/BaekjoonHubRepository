import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> map = new HashMap<>();

        int N = Integer.parseInt(br.readLine());
        while(N-->0) {
            String name = br.readLine();
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        int ansMax = 0;
        String ansStr = "";
        for(String key : map.keySet()) {
            if(ansMax < map.get(key)) {
                ansStr = key;
                ansMax = map.get(key);
            }
        }

        System.out.println(ansStr + " " + ansMax);
        br.close();
    }

}
