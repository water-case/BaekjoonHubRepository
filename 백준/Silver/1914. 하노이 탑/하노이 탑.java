import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 2^N - 1
        BigInteger res = new BigInteger(String.valueOf(2)).pow(N).subtract(BigInteger.ONE);
        System.out.println(res);

        if(N <= 20) {

            stepList = new ArrayList<>();
            hanoi(N, 1, 3, 2);

            StringBuilder sb = new StringBuilder();
            for(int[] step : stepList) {
                sb.append(step[0]).append(" ").append(step[1]).append("\n");
            }

            System.out.println(sb.toString());
        }

        br.close();
    }

    static List<int[]> stepList;

    private static void hanoi(int n, int start, int end, int mid) {

        if(n == 1) {
            stepList.add(new int[] {start, end});
        } else {
            hanoi(n-1, start, mid, end);
            stepList.add(new int[] {start, end});
            hanoi(n-1, mid, end, start);
        }

    }

}
