import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A1 = Integer.parseInt(st.nextToken());
        int B1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int A2 = Integer.parseInt(st.nextToken());
        int B2 = Integer.parseInt(st.nextToken());

        int A3 = A1 * B2 + A2 * B1;
        int B3 = B1 * B2;

        int g = gcd(A3, B3);

        System.out.println(A3 / g + " " + B3 / g);
        br.close();
    }

    private static int gcd(int x, int y) {
        if(y==0) {
            return x;
        } else {
            return gcd(y, x%y);
        }
    }

}
