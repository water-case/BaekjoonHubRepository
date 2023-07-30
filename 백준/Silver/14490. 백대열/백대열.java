import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), ":");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int gcd = gcd(n, m);

        System.out.print(n/gcd + ":" + m/gcd);
        br.close();
    }

    private static int gcd(int x, int y) {
        if(y == 0) {
            return x;
        }

        return gcd(y, x%y);
    }

}
