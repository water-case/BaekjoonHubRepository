import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        tcList = new ArrayList<>();
        int T = Integer.parseInt(br.readLine());
        while(T-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            List<Integer> aList = new ArrayList<>();
            List<Integer> bList = new ArrayList<>();

            st = new StringTokenizer(br.readLine(), " ");
            while(N-->0) {
                int n = Integer.parseInt(st.nextToken());
                aList.add(n);
            }

            st = new StringTokenizer(br.readLine(), " ");
            while(M-->0) {
                int m = Integer.parseInt(st.nextToken());
                bList.add(m);
            }

            Collections.sort(aList);
            Collections.sort(bList);

            tcList.add(new Fair(aList, bList));
        }

        br.close();
    }

    static List<Fair> tcList;

    private static void solve() {
        StringBuilder res = new StringBuilder();

        tcList.stream().forEach(tc -> {
            int cnt = 0;

            List<Integer> aList = tc.aList;
            List<Integer> bList = tc.bList;

            for(int a : aList) {
                int start = 0, end = bList.size()-1;

                while(start <= end) {
                    int mid = (start + end) / 2;

                    if(a > bList.get(mid)) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }

                cnt += start;
            }

            res.append(cnt).append("\n");
        });

        System.out.println(res);
    }

    private static class Fair {
        List<Integer> aList, bList;

        public Fair(List<Integer> aList, List<Integer> bList) {
            this.aList = aList;
            this.bList = bList;
        }
    }

}
