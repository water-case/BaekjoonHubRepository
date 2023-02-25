import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        init(br);
        solve();

        System.out.println(res);
        br.close();
    }

    private static void init(BufferedReader br) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        L = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        news = new ArrayList<>();
        for(int i=0; i<5; i++) {
            news.add(Integer.parseInt(st.nextToken()));
        }
    }

    static String res;
    static int L, P;
    static List<Integer> news;

    private static void solve() {
        StringBuilder sb = new StringBuilder();

        int cal = L*P;
        for(Integer i : news) {
            sb.append(i - cal).append(" ");
        }

        res = sb.toString();
    }

}
