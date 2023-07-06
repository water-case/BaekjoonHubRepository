import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        hList = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        while(N-->0) {
            hList.add(Integer.parseInt(st.nextToken()));
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static int L;
    static List<Integer> hList;

    private static void solve() {

        Collections.sort(hList);

        for(int h : hList) {
            if(L >= h) {
                L++;
            } else {
                break;
            }
        }

        System.out.println(L);
    }

}
