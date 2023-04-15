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

        numList = new ArrayList<>();
        String[] sa = br.readLine().split(" ");
        for(String s : sa) {
            numList.add(Integer.parseInt(s));
        }

        total = Integer.parseInt(br.readLine());

        br.close();
    }

    static int N, total;
    static List<Integer> numList;

    private static void solve() {
        int res = 0;

        int start = 0;
        int end = numList.stream().max(Integer::compare).get();

        res = binarySearch(start, end);

        System.out.println(res);
    }

    private static int binarySearch(int start, int end) {
        int res = 0;

        int mid = (start + end) / 2;
        int sum = calcSum(mid);

        if(start > end) {
            return end;
        }

        if(sum <= total) {
            res = binarySearch(mid+1, end);
        } else {
            res = binarySearch(start, mid-1);
        }

        return res;
    }

    private static int calcSum(int mid) {
        int res = 0;

        for(Integer i : numList) {
            if(i>=mid) {
                res += mid;
            } else {
                res += i;
            }
        }

        return res;
    }

}
