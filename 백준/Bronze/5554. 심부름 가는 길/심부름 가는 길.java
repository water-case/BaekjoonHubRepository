import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        timeList = new ArrayList<>();
        for(int i=0; i<4; i++) {
            timeList.add(Integer.parseInt(br.readLine()));
        }
    }

    static List<Integer> timeList;

    private static void solve() {
        int totalTime = timeList.stream().reduce(0, Integer::sum);

        int hour = totalTime / 60;
        int sec = totalTime % 60;

        System.out.println(hour);
        System.out.println(sec);
    }

}
