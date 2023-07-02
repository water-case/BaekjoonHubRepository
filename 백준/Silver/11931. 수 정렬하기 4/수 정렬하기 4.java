import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        nList = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());
        while(N-->0) {
            nList.add(Integer.parseInt(br.readLine()));
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static List<Integer> nList;

    private static void solve() {
        StringBuilder res = new StringBuilder();

        Collections.sort(nList, Comparator.reverseOrder());
        for(int n : nList) {
            res.append(n).append("\n");
        }

        System.out.println(res.toString());
    }

}
