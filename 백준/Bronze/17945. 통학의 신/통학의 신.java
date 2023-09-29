import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int b2c = (int) Math.sqrt(B*B-C);
        int cal1 = -B + b2c;
        int cal2 = -B - b2c;

        StringBuilder res = new StringBuilder();
        if(cal1 == cal2) {
            res.append(cal1);
        } else {
            res.append(cal1 > cal2 ? cal2 : cal1)
                .append(" ")
                .append(cal1 > cal2 ? cal1 : cal2);

        }

        System.out.println(res.toString());
        br.close();
    }

}
