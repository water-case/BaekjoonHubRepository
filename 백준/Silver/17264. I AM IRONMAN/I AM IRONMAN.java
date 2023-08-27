import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); // 게임횟수
        int P = Integer.parseInt(st.nextToken()); // 플레이어 정보의 수

        st = new StringTokenizer(br.readLine(), " ");
        int W = Integer.parseInt(st.nextToken());
        int L = -Integer.parseInt(st.nextToken());
        int G = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();
        while(P-->0) {
            st = new StringTokenizer(br.readLine(), " ");
            String pName = st.nextToken();
            String winLose = st.nextToken();

            map.put(pName, winLose.equals("W") ? W : L);
        }

        boolean chk = false;
        int score = 0;
        while(N-->0) {
            String withPlayer = br.readLine();

            score += map.containsKey(withPlayer) ? map.get(withPlayer) : L;
            if(score < 0) {
                score = 0;
            }

            if(score >= G) {
                chk = true;
                break;
            }
        }


        System.out.println(chk ? "I AM NOT IRONMAN!!" : "I AM IRONMAN!!");
        br.close();
    }

}
