import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        testList = new ArrayList<>();
        int T = Integer.parseInt(br.readLine());

        while(T-->0) {
            List<Integer> numList = new ArrayList<>();
            int N = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            while(N-->0) {
                numList.add(Integer.parseInt(st.nextToken()));
            }

            testList.add(numList);
        }

        br.close();
    }

    static List<List<Integer>> testList;

    private static void solve() {
        testList.stream().forEachOrdered(list -> {
            int sum = list.stream().reduce(Integer::sum).get();
            System.out.println(sum);
        });
    }

}
