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

    static int res, day;
    static List<Integer> carNum;

    private static void solve() {

        for(int i : carNum) {
            if(i == day) {
                res++;
            }
        }

    }

    private static void init(BufferedReader br) throws Exception {
        res = 0;
        day = Integer.parseInt(br.readLine());
        carNum = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while(st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            carNum.add(num);
        }
    }

}
