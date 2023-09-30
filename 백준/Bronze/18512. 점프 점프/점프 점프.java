import java.io.*;
import java.util.*;

public class Main {

    private static int MAX_SIZE = 10_000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int P1 = Integer.parseInt(st.nextToken());
        int P2 = Integer.parseInt(st.nextToken());

        int res = -1;
        while(P1 < MAX_SIZE || P2 < MAX_SIZE) {
            if(P1 < P2) {
                P1 += X;
            } else if(P1 > P2) {
                P2 += Y;
            } else {
                res = P1;
                break;
            }
        }

        System.out.println(res);
        br.close();
    }

}
