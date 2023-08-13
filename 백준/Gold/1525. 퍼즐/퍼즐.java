import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 메모리 제한때문에 해쉬맵사용이 강제되므로, 배열이 아닌 스트링으로 구조를 관리
        String str = "";
        for(int i=0; i<3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<3; j++) {
                str += st.nextToken();
            }
        }

        map = new HashMap<>();
        map.put(str, 0);

        if(!str.equals(ANS_STR)) {
            bfs(str);
        }

        System.out.println(map.containsKey(ANS_STR) ? map.get(ANS_STR) : "-1");
        br.close();
    }

    static int[] delx = {-1, 0, 1, 0}; // 상우하좌
    static int[] dely = { 0, 1, 0,-1}; // 상우하좌
    static String ANS_STR = "123456780";
    static Map<String, Integer> map;

    private static void bfs(String str) {

        Queue<String> q = new ArrayDeque<>();
        q.offer(str);

        while(!q.isEmpty()) {
            String now = q.poll();

            int zeroPos = now.indexOf("0");
            int x = zeroPos / 3;
            int y = zeroPos % 3;

            for(int d=0; d<4; d++) {

                int dx = x + delx[d], dy = y + dely[d];

                if(dx<0 || dx>=3 || dy<0 || dy>=3) {
                    continue;
                }

                int swapPos = dx*3 + dy;

                StringBuilder sb = new StringBuilder(now);
                char tmp = sb.charAt(swapPos);
                sb.setCharAt(swapPos, '0');
                sb.setCharAt(zeroPos, tmp);

                if(sb.toString().equals(ANS_STR)) {
                    map.put(sb.toString(), map.get(now) + 1);
                    return;
                } else if(!map.containsKey(sb.toString())) {
                    q.offer(sb.toString());
                    map.put(sb.toString(), map.get(now) + 1);
                }
            }

        }

    }

}
