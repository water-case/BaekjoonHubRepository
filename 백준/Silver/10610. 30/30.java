import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] sarr = br.readLine().split("");

        nList = new ArrayList<>();
        for(int i=0; i< sarr.length; i++) {
            nList.add(Integer.parseInt(sarr[i]));
        }

        Collections.sort(nList, Collections.reverseOrder());

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static List<Integer> nList;

    private static void solve() {
        String res = "-1";

        if(nList.get(nList.size()-1) == 0) {

            int sum = 0;
            for(int n : nList) {
                sum += n;
            }

            if(sum%3 == 0) {
                res = nList.stream().map(i -> String.valueOf(i)).collect(Collectors.joining());
            }
        }

        System.out.println(res);
    }

}
