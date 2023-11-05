import java.io.*;
import java.util.*;

public class Main {

    static final int MAX = 10_000, MIN = -10_000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int startX = MIN, endX = MAX;
        int startY = MIN, endY = MAX;

        int N = Integer.parseInt(br.readLine());
        while(N-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int x = Integer.parseInt(st.nextToken());
            startX = Math.max(startX, x);
            endX = Math.min(endX, x);

            int y = Integer.parseInt(st.nextToken());
            startY = Math.max(startY, y);
            endY = Math.min(endY, y);
        }

        System.out.println((endX - startX) * (endY - startY));
    }

}
