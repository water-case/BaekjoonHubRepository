import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        hashSet = new HashSet<>();

        String s = br.readLine();
        for(int i=0; i<s.length(); i++) {
            hashSet.add(s.substring(i));
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static Set<String> hashSet;

    private static void solve() {
        StringBuilder res = new StringBuilder();

        hashSet.stream().sorted().forEach(s -> res.append(s).append("\n"));

        System.out.println(res);
    }

}
