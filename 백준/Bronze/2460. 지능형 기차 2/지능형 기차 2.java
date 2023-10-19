import java.io.*;
import java.util.*;

public class Main {

    static final int MAX_SIZE = 10_000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int res = Integer.MIN_VALUE;

        int now = 0;

        String str = "";
        while((str = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(str, " ");
            now -= Integer.parseInt(st.nextToken());
            now += Integer.parseInt(st.nextToken());

            if(now > MAX_SIZE) {
                now = MAX_SIZE;
            }

            res = Math.max(res, now);
        }

        System.out.println(res);
        br.close();
    }

}
