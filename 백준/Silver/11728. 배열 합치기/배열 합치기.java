import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        nList = new ArrayList<>();
        st = new StringTokenizer(br.readLine(), " ");
        while(A-->0) {
            nList.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine(), " ");
        while(B-->0) {
            nList.add(Integer.parseInt(st.nextToken()));
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

        Collections.sort(nList);
        nList.stream().forEach(n -> res.append(n).append(" "));

        System.out.println(res.toString());
    }

}
