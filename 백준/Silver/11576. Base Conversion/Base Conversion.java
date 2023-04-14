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
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        nlist = new ArrayList<>();
        m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<m; i++) {
            nlist.add(Integer.parseInt(st.nextToken()));
        }

        br.close();
    }

    static int A, B, m;
    static List<Integer> nlist;

    private static void solve() {
        StringBuilder res = new StringBuilder();

        int num = 0;
        for(int i=0; i<m; i++) {
            num += nlist.get(m-i-1)*(int) Math.pow(A, i);
        }

        List<Integer> ansList = new ArrayList<>();
        int idx = 1;
        while(num > 0) {
            int n = num%(idx*B);
            ansList.add(n/idx);
            num -= n;
            idx *= B;
        }

        for(int i=ansList.size()-1; i>=0; i--) {
            res.append(ansList.get(i)).append(" ");
        }

        System.out.println(res);
    }

}
