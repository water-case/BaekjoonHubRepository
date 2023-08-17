import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> map = new HashMap<>();

        int N = Integer.parseInt(br.readLine());
        while(N-->0) {
            StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            StringTokenizer st3 = new StringTokenizer(br.readLine(), " ");
            StringTokenizer st4 = new StringTokenizer(br.readLine(), " ");

            while(st1.hasMoreTokens()) {
                String name1 = st1.nextToken();
                String name2 = st2.nextToken();
                String name3 = st3.nextToken();
                String name4 = st4.nextToken();

                if(name1.equals("-")) {
                    continue;
                }

                map.put(name1, map.getOrDefault(name1, 0) +  4);
                map.put(name2, map.getOrDefault(name2, 0) +  6);
                map.put(name3, map.getOrDefault(name3, 0) +  4);
                map.put(name4, map.getOrDefault(name4, 0) + 10);
            }
        }

        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(String name : map.keySet()) {
            max = Math.max(map.get(name), max);
            min = Math.min(map.get(name), min);
        }
        System.out.println(max - min > 12 ? "No" : "Yes");
        br.close();
    }

}
