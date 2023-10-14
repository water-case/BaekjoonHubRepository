import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
        recursion(Integer.parseInt(br.readLine()), 0);

        System.out.println(min + " " + max);
        br.close();
    }

    static int max, min;

    private static void recursion(int num, int cnt) {
        cnt += cntOdd(num);

        if(num<10) {
            max = Math.max(max, cnt);
            min = Math.min(min, cnt);
            return;
        }

        if(num<100) {
            recursion(num%10 + num/10, cnt);
            return;
        }

        String sNum = String.valueOf(num);
        int disit = sNum.length();
        for(int i=1; i<=disit-2; i++) {
            String s1 = sNum.substring(0, i);

            for(int j=i+1; j<=disit-1; j++) {
                String s2 = sNum.substring(i, j);
                String s3 = sNum.substring(j, disit);

                int nextNum = Integer.parseInt(s1) + Integer.parseInt(s2) + Integer.parseInt(s3);
                recursion(nextNum, cnt);
            }
        }
    }

    private static boolean isOdd(int num) {
        return num%2 == 1 ? true : false;
    }

    private static int cntOdd(int num) {
        int res = 0;

        while(num > 0) {
            res += isOdd(num%10) ? 1 : 0;
            num /= 10;
        }

        return res;
    }

}
