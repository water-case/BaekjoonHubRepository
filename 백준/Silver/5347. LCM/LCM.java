import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수

        StringBuilder res = new StringBuilder();
        while(n-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());

            long gcd = gcd(a, b);
            res.append(a * b / gcd).append("\n");
        }

        System.out.print(res.toString());
        br.close();
    }

    private static long gcd(long x, long y) {
        if(y == 0) {
            return x;
        }

        return gcd(y, x%y);
    }


}
