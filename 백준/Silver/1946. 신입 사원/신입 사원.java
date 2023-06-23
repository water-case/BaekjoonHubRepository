import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        tcList = new ArrayList<>();

        int T = Integer.parseInt(br.readLine());
        while(T-->0) {

            List<int[]> nList = new ArrayList<>();

            int N = Integer.parseInt(br.readLine());
            while(N-->0) {

                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                nList.add(new int[] {a, b});
            }

            nList.sort((o1, o2) -> {
                if(o1[0] > o2[0]) {
                    return 1;
                }
                if(o1[0] == o2[0]) {
                    return 0;
                }
                return -1;
            });

            tcList.add(new TC(nList));
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static List<TC> tcList;

    private static void solve() {
        StringBuilder res = new StringBuilder();

        for(TC tc : tcList) {
            int max = tc.nList.get(0)[1];
            int cnt = 1;

            for(int[] ia : tc.nList) {
                if(ia[1] < max) {
                    cnt++;
                    max = ia[1];
                }
            }

            res.append(cnt).append("\n");
        }

        System.out.println(res.toString());
    }

    private static class TC {
        List<int[]> nList;

        public TC(List<int[]> nList) {
            this.nList = nList;
        }
    }

}
