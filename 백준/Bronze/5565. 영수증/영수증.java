import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        total = Integer.parseInt(br.readLine());

        priceList = new ArrayList<>();
        for(int i=0; i<9; i++) {
            priceList.add(Integer.parseInt(br.readLine()));
        }
    }

    static int total;
    static List<Integer> priceList;

    private static void solve() {
        int sum = priceList.stream().reduce(0, Integer::sum);

        int res = total - sum;

        System.out.println(res);
    }

}
