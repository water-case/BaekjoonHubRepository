import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int R = Integer.parseInt(st.nextToken());
        int G = Integer.parseInt(st.nextToken());

        StringBuilder res = new StringBuilder();
        int gcd = gcd(R, G);
        for(int i=1; i<=gcd/2; i++) {
            if( (R%i == 0) && (G%i == 0) ) {
                res.append(i).append(" ").append(R/i).append(" ").append(G/i).append("\n");
            }
        }
        res.append(gcd).append(" ").append(R/gcd).append(" ").append(G/gcd).append("\n");

        System.out.print(res.toString());
        br.close();
    }

    private static int gcd(int x, int y) {

        if(y == 0) {
            return x;
        }

        return gcd(y, x%y);

    }

}
