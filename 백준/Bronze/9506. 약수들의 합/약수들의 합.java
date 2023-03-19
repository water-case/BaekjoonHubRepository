import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        numList = new ArrayList<>();
        String s = "";
        while(!(s = br.readLine()).equals("-1")) {
            numList.add(Integer.parseInt(s));
        }

        br.close();
    }

    static List<Integer> numList;


    private static void solve() {
        StringBuilder sb = new StringBuilder();

        for(Integer n : numList) {
            sb.append(n).append(" ");

            List<Integer> ans = new ArrayList<>();

            for(int i=2; i<=Math.sqrt(n); i++) {
                if(n%i == 0) {
                    ans.add(i);
                    ans.add(n/i);
                }
            }

            if(ans.size()!=0 && ans.stream().reduce(Integer::sum).get() == n-1) {
                sb.append("= 1");
                ans.sort(Integer::compareTo);
                ans.stream().forEachOrdered(i -> sb.append(" + ").append(i));
            } else {
                sb.append("is NOT perfect.");
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }

}
