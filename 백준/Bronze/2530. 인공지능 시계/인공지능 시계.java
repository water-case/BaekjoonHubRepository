import java.io.*;
import java.util.*;

public class Main {

    private static final int MIN_SEC = 60;
    private static final int HOUR_SEC = MIN_SEC * 60;
    private static final int DAY_SEC = HOUR_SEC * 24;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int D = Integer.parseInt(br.readLine());

        int cal = A*HOUR_SEC + B*MIN_SEC + C;
        cal += D;

        cal %= DAY_SEC;

        StringBuilder res = new StringBuilder();
        int div = HOUR_SEC;
        while(div>0) {
            res.append(cal / div).append(" ");
            cal %= div;
            div /= MIN_SEC;
        }

        System.out.println(res.toString());
        br.close();
    }

}
