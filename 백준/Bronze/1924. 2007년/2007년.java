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
    static int x, y;
    static DAY startDay;
    static int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    private static void solve() {
        int cnt=0;

        int nowX = 1, nowY = 1;
        while(true) {
            if(nowX==x && nowY==y) {
                break;
            }

            cnt++;
            if(nowY == days[nowX-1]) {
                nowX++;
                nowY = 1;
            } else {
                nowY++;
            }
        }

        res = DAY.values()[(startDay.ordinal()+cnt)%7].name();
    }

    private static void init(BufferedReader br) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());

        startDay = DAY.MON;
    }

    enum DAY {
        SUN, MON, TUE, WED, THU, FRI, SAT;
    }

}
