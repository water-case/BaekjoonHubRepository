import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        nList = new ArrayList<>();
        nList.add(0);
        int sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while(N-->0) {
            sum += Integer.parseInt(st.nextToken());;
            nList.add(sum);
        }

        int M = Integer.parseInt(br.readLine());
        tcList = new ArrayList<>();
        while(M-->0) {
            st = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st.nextToken())-1;
            int j = Integer.parseInt(st.nextToken());
            tcList.add(new int[] {i, j});
        }

        br.close();
    }

    static List<Integer> nList;
    static List<int[]> tcList;

    private static void solve() {
        StringBuilder res = new StringBuilder();

        for(int[] ia : tcList) {
            int cal = nList.get(ia[1]) - nList.get(ia[0]);
            res.append(cal).append("\n");
        }

        System.out.println(res);
    }

}
