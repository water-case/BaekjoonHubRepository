import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        start = Integer.parseInt(st.nextToken())-1;
        end = Integer.parseInt(st.nextToken())-1;

        br.close();
    }

    static int start, end;

    private static void solve() {
        int res = 0;

        List<Integer> sequence = new ArrayList<>();
        int idx=1, cnt=0;

        while(sequence.size() <= end) {
            sequence.add(idx);
            cnt++;
            if(cnt == idx) {
                idx++;
                cnt=0;
            }
        }

        res = sequence.stream().skip(start).mapToInt(Integer::intValue).sum();

        System.out.println(res);
    }

}
