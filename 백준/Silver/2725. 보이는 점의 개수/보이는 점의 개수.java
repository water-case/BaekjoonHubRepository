import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder res = new StringBuilder();

        int[] memo = new int[MAX_POS];
        memo[1] = 3;

        for(int i=2; i<MAX_POS; i++) {

            int cnt = 0;

            for(int j=1; j<i; j++) {
                if(gcd(i, j) == 1) {
                    cnt++;
                }
            }

            memo[i] = memo[i-1] + cnt * 2;
        }


        int C = Integer.parseInt(br.readLine());
        while(C-->0) {
            res.append(memo[Integer.parseInt(br.readLine())]).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

    static final int MAX_POS = 1001;

    private static int gcd(int x, int y) {
        if(y == 0) {
            return x;
        }

        return gcd(y, x%y);
    }

}
