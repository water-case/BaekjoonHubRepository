import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] sArr = br.readLine().split(" ");
        long A = Long.parseLong(sArr[0]);
        long B = Long.parseLong(sArr[1]);

        long gcd = gcd(A, B);
        StringBuilder res = new StringBuilder();
        for(int i=0; i<gcd; i++) {
            res.append("1");
        }
        System.out.println(res.toString());
        br.close();
    }

    private static long gcd(long x, long y) {
        if(y == 0) {
            return x;
        }

        return gcd(y, x%y);
    }

}
