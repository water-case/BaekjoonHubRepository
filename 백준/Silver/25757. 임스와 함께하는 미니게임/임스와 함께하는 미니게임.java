import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); // 신청한 횟수
        String type = st.nextToken(); // 게임의 종류

        Map<String, Integer> gameNum = new HashMap<>(); // 게임의 종류에 따른 필요한 사람 수
        gameNum.put("Y", 2);
        gameNum.put("F", 3);
        gameNum.put("O", 4);

        int gameNeedNum = gameNum.get(type) - 1; // 게임에 필요한 사람 수

        Set<String> memSet = new HashSet<>(); // 신청한 사람들을 중복제거하여 저장하기 위한 집합
        while(N-->0) {
            memSet.add(br.readLine());
        }

        System.out.println(memSet.size() / gameNeedNum);
        br.close();
    }

}
