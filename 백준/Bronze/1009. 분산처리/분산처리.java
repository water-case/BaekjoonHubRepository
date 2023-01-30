import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        init(br);
        solve();

        System.out.println(res);
        br.close();
    }

    static String res;
    static List<int[]> datas;

    private static void solve() {
        StringBuilder sb = new StringBuilder();

        for(int[] ia : datas) {
            int cal = ia[0] % 10;

            for(int i=1; i<ia[1]; i++) {
                cal = cal * ia[0] % 10;
            }

            cal = cal==0 ? 10 : cal;

            sb.append(cal).append("\n");
        }

        res = sb.toString();
    }

    private static void init(BufferedReader br) throws Exception {
        datas = new ArrayList<>();
        int T = Integer.parseInt(br.readLine());

        while(T-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int[] data = new int[2];
            data[0] = Integer.parseInt(st.nextToken());
            data[1] = Integer.parseInt(st.nextToken());

            datas.add(data);
        }
    }

}
