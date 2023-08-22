import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();
        String[] sArr = br.readLine().split(" ");
        for(int i=0; i<N; i++) {
            map.put(sArr[i], i);
        }

        int cnt = 0;
        String[] ansArr = br.readLine().split(" ");
        for(int i=0; i<N-1; i++) {
            for(int j=i+1; j<N; j++) {
                if(map.get(ansArr[i]) < map.get(ansArr[j])) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt + "/" + N*(N-1)/2);
        br.close();
    }

}
