import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        nSet = new HashSet<>();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while(N-->0) {
            nSet.add(Integer.parseInt(st.nextToken()));
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static Set<Integer> nSet;

    private static void solve() {
        StringBuilder res = new StringBuilder();

        nSet.stream().sorted().forEach(n -> res.append(n).append(" "));

        System.out.println(res.toString());
    }

}
