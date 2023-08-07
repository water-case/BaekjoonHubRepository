import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> participantsMap = new HashMap<>();

        int N = Integer.parseInt(br.readLine()); // 참가자 수
        int idx = N;
        while(idx-->0) {
            String name = br.readLine();
            participantsMap.put(name, participantsMap.getOrDefault(name, 0) + 1);
        }

        idx = N-1;
        while(idx-->0) {
            String name = br.readLine();
            if(participantsMap.get(name) > 1) {
                participantsMap.put(name, participantsMap.get(name) - 1);
                continue;
            }
            participantsMap.remove(name);
        }

        System.out.println(participantsMap.entrySet().iterator().next().getKey());
        br.close();
    }

}
