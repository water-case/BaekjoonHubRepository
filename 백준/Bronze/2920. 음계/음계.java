import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        init(br);
        solve();

        System.out.println(res);
        br.close();;
    }

    static String res;
    static ArrayList<Integer> list;

    private static void solve() {
        int direct = list.get(1) - list.get(0);

        res = "mixed";
        if(direct > 0) {
            if(cendingCheck(true)) {
                res = "ascending";
            }
        } else if(direct < 0) {
            if(cendingCheck(false)) {
                res = "descending";
            }
        } else {
            res = "mixed";
        }
    }

    private static boolean cendingCheck(boolean b) {
        boolean res = true;

        if(!b) {
            Collections.reverse(list);
        }

        int now = list.get(0);
        for(int i=1; i<list.size(); i++) {
            int next = list.get(i);

            if(now>next) {
                res = false;
                break;
            }

            now = next;
        }

        return res;
    }

    private static void init(BufferedReader br) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        list = new ArrayList<>();
        while(st.hasMoreTokens()) {
            int n = Integer.parseInt(st.nextToken());
            list.add(n);
        }
    }


}
