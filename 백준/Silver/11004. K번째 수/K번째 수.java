import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        nList = new ArrayList<>();

        st = new StringTokenizer(br.readLine(), " ");
        while(N-->0) {
            nList.add(Integer.parseInt(st.nextToken()));
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static int K;
    static List<Integer> nList;

    private static void solve() {
        int res = 0;

        Collections.sort(nList);
        res = nList.get(K-1);

        System.out.println(res);
    }

}
