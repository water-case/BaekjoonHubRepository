import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        nList = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++) {
            nList.add(Integer.parseInt(st.nextToken()));
        }
        nList.sort(Integer::compare);

        br.close();
    }

    static int N;
    static List<Integer> nList;

    private static void solve() {
        int res = 0;

        boolean[] v = new boolean[N];
        for(int i=0; i<N; i++) {
            for(int j=i+1; j<N; j++) {
                if(i == j) {
                    continue;
                }

                int sum = nList.get(i) + nList.get(j);

                int start = 0, end = N-1;
                while(start <= end) {
                    int mid = (start + end) / 2;

                    int val = nList.get(mid);
                    if(sum == val && !v[mid] && mid != i && mid != j) {
                        v[mid] = true;
                        res++;

                        res += directSearch(mid, sum, v, 1);
                        res += directSearch(mid, sum, v, -1);
                        break;
                    }

                    if(sum > val) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
            }
        }

        System.out.println(res);
    }

    private static int directSearch(int idx, int sum, boolean[] v, int d) {
        int res = 0;

        while(true) {
            idx += d;
            if(idx < N && idx >= 0 && nList.get(idx) == sum && !v[idx]) {
                v[idx] = true;
                res++;
            } else {
                break;
            }
        }
        return res;
    }

}
