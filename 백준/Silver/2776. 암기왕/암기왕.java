import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());

        tcList = new ArrayList<>();
        for(int tc=0; tc<T; tc++) {
            List<Integer> nList = new ArrayList<>();
            List<Integer> mList = new ArrayList<>();

            N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int i=0; i<N; i++){
                nList.add(Integer.parseInt(st.nextToken()));
            }
            M = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine(), " ");
            for(int i=0; i<M; i++){
                mList.add(Integer.parseInt(st.nextToken()));
            }

            Collections.sort(nList);

            tcList.add(new TC(nList, mList));
        }

        br.close();
    }

    static int T, N, M;
    static List<TC> tcList;

    private static void solve() {
        StringBuilder res = new StringBuilder();

        tcList.stream().forEach(tc -> {
            List<Integer> nList = tc.nList;
            List<Integer> mList = tc.mList;

            mList.stream()
                    .map(m -> isExistNum(m, nList))
                    .forEach(chk -> res.append(chk ? 1 : 0).append("\n"));
        });

        System.out.println(res);
    }

    private static boolean isExistNum(int m, List<Integer> nList) {
        boolean res = false;

        int start = 0, end = nList.size()-1;

        while(start <= end) {
            int mid = (start + end) / 2;
            int n = nList.get(mid);

            if(n == m) {
                res = true;
                break;
            } else if(n > m) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return res;
    }

    static class TC {
        List<Integer> nList, mList;

        public TC(List<Integer> nList, List<Integer> mList) {
            this.nList = nList;
            this.mList = mList;
        }
    }

}
