import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        nList = new ArrayList<>();
        while(N-->0) {
            nList.add(Integer.parseInt(st.nextToken()));
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static int L;
    static List<Integer> nList;

    private static void solve() {

        Collections.sort(nList);

        int idx = nList.get(0), res = 1;

        for(int i=1; i<nList.size(); i++) {

            int nowIdx = nList.get(i);

            if(nowIdx - idx >= L) {

                idx = nowIdx;
                res++;
            }
        }

        System.out.println(res);
    }

}
