import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long A = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());

        long g = gcd(A, B);

        System.out.println(A * B / g);
        br.close();
    }

    private static long gcd(long x, long y) {
        if(y==0) {
            return x;
        } else {
            return gcd(y, x%y);
        }
    }


}
