import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        Map<Integer, Integer> hashMap = new HashMap<>();

        int N = 10;
        while(N-->0) {
            int n = Integer.parseInt(br.readLine());
            sum+=n;
            hashMap.put(n, hashMap.getOrDefault(n, 0)+1);
        }

        System.out.println(sum/10);
        System.out.println(hashMap.entrySet().stream()
                .max((o1, o2) -> Integer.compare(o1.getValue(), o2.getValue()))
                .get()
                .getKey());
        br.close();
    }

}
