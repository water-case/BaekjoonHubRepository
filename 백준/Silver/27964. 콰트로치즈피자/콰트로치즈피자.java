import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Set<String> cheeseSet = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int cnt = 0;
        while(N-->0) {
            String nowCheese = st.nextToken();

            if(nowCheese.length() < 6) {
                continue;
            }

            String suffix = nowCheese.substring(nowCheese.length()-6, nowCheese.length());
            if(suffix.contains("Cheese") && !cheeseSet.contains(nowCheese)) {
                if(cnt++ >= 4) {
                    break;
                }
            }
            cheeseSet.add(nowCheese);
        }

        System.out.println(cnt>=4 ? "yummy" : "sad");

        br.close();
    }

}
