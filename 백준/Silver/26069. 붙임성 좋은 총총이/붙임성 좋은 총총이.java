import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 사람들이 만난 기록의 수

        Set<String> danceSet = new HashSet<>();
        danceSet.add("ChongChong");
        while(N-->0) {
            String[] log = br.readLine().split(" ");

            // set은 중복이 제거되므로 따로 조건처리 하지않고
            // 둘 중 하나라도 set에 있으면 둘 다 추가
            if(danceSet.contains(log[0]) || danceSet.contains(log[1])) {
                danceSet.add(log[0]);
                danceSet.add(log[1]);
            }
        }

        System.out.println(danceSet.size());
        br.close();
    }

}
