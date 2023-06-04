import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        S = br.readLine();
        T = br.readLine();

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static String S;
    static String T;

    private static void solve() {
        int res = 1;

        List<Character> cList = new ArrayList<>();
        for(int i=0; i<T.length(); i++) {
            cList.add(T.charAt(i));
        }

        int idx = cList.size() - 1;
        while(cList.size() > S.length()) {

            if(cList.get(idx) == 'A') {

                cList.remove(idx);

            } else {

                cList.remove(idx);
                cList = reverse(cList);
            }

            idx--;
        }

        for(int i=0; i<S.length(); i++) {
            if(S.charAt(i) != cList.get(i).charValue()) {
                res = 0;
                break;
            }
        }

        System.out.println(res);
    }

    private static List<Character> reverse(List<Character> list) {
        List<Character> res = new ArrayList<>();
        int idx = list.size();
        while(idx-->0) {
            res.add(list.get(idx));
        }
        return res;
    }

}
