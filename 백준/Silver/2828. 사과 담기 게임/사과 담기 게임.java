import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        J = Integer.parseInt(br.readLine());
        jArr = new int[J];
        for(int i=0; i<J; i++) {
            jArr[i] = Integer.parseInt(br.readLine());
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static int N, M, J, jArr[];

    private static void solve() {
        int res = 0;

        int start = 1, end = start+M-1;
        for(int i=0; i<J; i++) {
            int cal = 0;
            if(start > jArr[i]) {
                cal = start - jArr[i];
                start -= cal;
                end -= cal;
            } else if(end < jArr[i]) {
                cal = jArr[i] - end;
                start += cal;
                end += cal;
            }
            res += cal;
        }

        System.out.println(res);
    }

}
