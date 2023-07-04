import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        tcList = new ArrayList<>();

        int T = Integer.parseInt(br.readLine());
        while(T-->0) {
            List<Integer> tc = Arrays.stream(br.readLine().split(" "))
                    .map(Integer::parseInt)
                    .sorted(Collections.reverseOrder())
                    .collect(Collectors.toList());

            tcList.add(tc);
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static List<List<Integer>> tcList;

    private static void solve() {
        StringBuilder res = new StringBuilder();

        for(List<Integer> tc : tcList) {
            res.append(tc.get(2)).append("\n");
        }

        System.out.println(res.toString());
    }

}
