import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        sList = new ArrayList<>();
        while(N-->0) {
            String s = br.readLine();
            sList.add(s);
            maxSize = Math.max(maxSize, s.length());
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static int N, maxSize;
    static List<String> sList;

    private static void solve() {
        int res = 1;

        while(res <= maxSize) {
            Set<String> hashSet = new HashSet<>();
            for(String s : sList) {
                String sub = s.substring(s.length()-res, s.length());
                if(hashSet.contains(sub)) {
                    break;
                }
                hashSet.add(sub);
            }
            if(hashSet.size() == sList.size()) {
                break;
            }
            res++;
        }


        System.out.println(res);
    }

}
