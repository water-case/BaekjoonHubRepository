import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        K = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());

        hashSet = new LinkedHashSet<>();
        while(L-->0) {
            String s = br.readLine();
            if(hashSet.contains(s)) {
                hashSet.remove(s);
            }
            hashSet.add(s);
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static int K, L;
    static Set<String> hashSet;

    private static void solve() {
        StringBuilder res = new StringBuilder();

        hashSet.stream().limit(K).forEach(s -> res.append(s.toString()).append("\n"));

        System.out.println(res.toString());
    }

}
