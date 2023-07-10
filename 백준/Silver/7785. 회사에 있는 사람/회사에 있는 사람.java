import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        set = new HashSet<>();
        while(N-->0) {
            String[] sa = br.readLine().split(" ");
            if(sa[1].equals("enter")) {
                set.add(sa[0]);
            } else {
                set.remove(sa[0]);
            }
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static Set<String> set;

    private static void solve() {
        StringBuilder res = new StringBuilder();

        set.stream()
                .sorted(Collections.reverseOrder())
                .forEach(str -> res.append(str).append("\n"));

        System.out.println(res.toString());
    }

}
